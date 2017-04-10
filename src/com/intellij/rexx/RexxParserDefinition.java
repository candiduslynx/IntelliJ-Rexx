package com.intellij.rexx;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.antlr.jetbrains.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.jetbrains.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.jetbrains.adaptor.lexer.RuleIElementType;
import org.antlr.jetbrains.adaptor.lexer.TokenIElementType;
import org.antlr.jetbrains.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.jetbrains.adaptor.psi.ANTLRPsiNode;
import com.intellij.rexx.psi.InstructionSubtree;
import com.intellij.rexx.psi.RexxPSIFileRoot;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RexxParserDefinition implements ParserDefinition {
	public static final IFileElementType FILE =
		new IFileElementType(RexxLanguage.INSTANCE);

	public static TokenIElementType VAR_SYMBOL;
	public static TokenIElementType STRING_Token;

	static {
		PSIElementTypeFactory.defineLanguageIElementTypes(RexxLanguage.INSTANCE,
			RexxParser.tokenNames,
			RexxParser.ruleNames);
		List<TokenIElementType> tokenIElementTypes =
			PSIElementTypeFactory.getTokenIElementTypes(RexxLanguage.INSTANCE);
		VAR_SYMBOL = tokenIElementTypes.get(RexxLexer.VAR_SYMBOL);
		STRING_Token = tokenIElementTypes.get(RexxLexer.STRING);
	}

	public static final TokenSet COMMENTS =
		PSIElementTypeFactory.createTokenSet(
			RexxLanguage.INSTANCE,
			RexxLexer.LINE_COMMENT,
			RexxLexer.BLOCK_COMMENT,
			RexxLexer.CONTINUATION);

	public static final TokenSet WHITESPACE =
		PSIElementTypeFactory.createTokenSet(
			RexxLanguage.INSTANCE,
			RexxLexer.WHISPACES);

	public static final TokenSet STRING =
		PSIElementTypeFactory.createTokenSet(
			RexxLanguage.INSTANCE,
			RexxLexer.STRING);

	public static final TokenSet KEYWORDS =
		PSIElementTypeFactory.createTokenSet(
			RexxLanguage.INSTANCE,
			RexxLexer.KWD_ADDRESS,
			RexxLexer.KWD_ALL,
			RexxLexer.KWD_APPEND,
			RexxLexer.KWD_ARG,
			RexxLexer.KWD_BY,
			RexxLexer.KWD_CALL,
			RexxLexer.KWD_COMMANDS,
			RexxLexer.KWD_DIGITS,
			RexxLexer.KWD_DO,
			RexxLexer.KWD_DROP,
			RexxLexer.KWD_ELSE,
			RexxLexer.KWD_END,
			RexxLexer.KWD_ENGINEERING,
			RexxLexer.KWD_ERROR,
			RexxLexer.KWD_EXIT,
			RexxLexer.KWD_EXPOSE,
			RexxLexer.KWD_EXTERNAL,
			RexxLexer.KWD_FAILURE,
			RexxLexer.KWD_FOR,
			RexxLexer.KWD_FOREVER,
			RexxLexer.KWD_FORM,
			RexxLexer.KWD_FUZZ,
			RexxLexer.KWD_HALT,
			RexxLexer.KWD_IF,
			RexxLexer.KWD_INPUT,
			RexxLexer.KWD_INTERMEDIATES,
			RexxLexer.KWD_INTERPRET,
			RexxLexer.KWD_ITERATE,
			RexxLexer.KWD_LABELS,
			RexxLexer.KWD_LEAVE,
			RexxLexer.KWD_LINEIN,
			RexxLexer.KWD_NAME,
			RexxLexer.KWD_NOP,
			RexxLexer.KWD_NORMAL,
			RexxLexer.KWD_NOVALUE,
			RexxLexer.KWD_NUMERIC,
			RexxLexer.KWD_OFF,
			RexxLexer.KWD_ON,
			RexxLexer.KWD_OPTIONS,
			RexxLexer.KWD_OTHERWISE,
			RexxLexer.KWD_OUTPUT,
			RexxLexer.KWD_PARSE,
			RexxLexer.KWD_PROCEDURE,
			RexxLexer.KWD_PULL,
			RexxLexer.KWD_PUSH,
			RexxLexer.KWD_QUEUE,
			RexxLexer.KWD_REPLACE,
			RexxLexer.KWD_RESULTS,
			RexxLexer.KWD_RETURN,
			RexxLexer.KWD_SAY,
			RexxLexer.KWD_SCAN,
			RexxLexer.KWD_SCIENTIFIC,
			RexxLexer.KWD_SELECT,
			RexxLexer.KWD_SIGNAL,
			RexxLexer.KWD_SOURCE,
			RexxLexer.KWD_STEM,
			RexxLexer.KWD_STREAM,
			RexxLexer.KWD_SYNTAX,
			RexxLexer.KWD_THEN,
			RexxLexer.KWD_TO,
			RexxLexer.KWD_TRACE,
			RexxLexer.KWD_UNTIL,
			RexxLexer.KWD_UPPER,
			RexxLexer.KWD_VALUE,
			RexxLexer.KWD_VAR,
			RexxLexer.KWD_VERSION,
			RexxLexer.KWD_WHEN,
			RexxLexer.KWD_WHILE,
			RexxLexer.KWD_WITH
		);

	@NotNull
	@Override
	public Lexer createLexer(Project project) {
		RexxLexer lexer = new RexxLexer(null);
		return new ANTLRLexerAdaptor(RexxLanguage.INSTANCE, lexer);
	}

	@NotNull
	public PsiParser createParser(final Project project) {
		final RexxParser parser = new RexxParser(null);
		return new ANTLRParserAdaptor(RexxLanguage.INSTANCE, parser) {
			@Override
			protected ParseTree parse(Parser parser, IElementType root) {
				// start rule depends on root passed in
				// sometimes we want to create an VAR_SYMBOL node etc...
				if ( root instanceof IFileElementType ) {
					return ((RexxParser) parser).file();
				}
				// let's hope it's an VAR_SYMBOL as needed by "rename function"
				return ((RexxParser) parser).var_symbol();
			}
		};
	}

	/** "Tokens of those types are automatically skipped by PsiBuilder." */
	@NotNull
	public TokenSet getWhitespaceTokens() {
		return WHITESPACE;
	}

	@NotNull
	public TokenSet getCommentTokens() {
		return COMMENTS;
	}

	@NotNull
	public TokenSet getStringLiteralElements() {
		return STRING;
	}

	public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
		// Need a spece if at least 1 part is a keyword
		if (KEYWORDS.contains(left.getElementType()) ||
			KEYWORDS.contains(right.getElementType()))
			return SpaceRequirements.MUST;
		return SpaceRequirements.MAY;
	}

	@Override
	public IFileElementType getFileNodeType() {
		return FILE;
	}

	@Override
	public PsiFile createFile(FileViewProvider viewProvider) {
		return new RexxPSIFileRoot(viewProvider);
	}

	@NotNull
	public PsiElement createElement(ASTNode node) {
		IElementType elType = node.getElementType();
		if ( elType instanceof TokenIElementType ) {
			return new ANTLRPsiNode(node);
		}
		if ( !(elType instanceof RuleIElementType) ) {
			return new ANTLRPsiNode(node);
		}
		RuleIElementType ruleElType = (RuleIElementType) elType;
		switch ( ruleElType.getRuleIndex() ) {
			case RexxParser.RULE_instruction :
				return new InstructionSubtree(node);
			default :
				return new ANTLRPsiNode(node);
		}
	}
}