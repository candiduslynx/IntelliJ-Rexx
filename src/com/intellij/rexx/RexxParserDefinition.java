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

	public static TokenIElementType ID;

	static {
		PSIElementTypeFactory.defineLanguageIElementTypes(RexxLanguage.INSTANCE,
			RexxParser.tokenNames,
			RexxParser.ruleNames);
		List<TokenIElementType> tokenIElementTypes =
			PSIElementTypeFactory.getTokenIElementTypes(RexxLanguage.INSTANCE);
		ID = tokenIElementTypes.get(RexxLexer.VAR_SYMBOL);
	}

	public static final TokenSet COMMENTS =
		PSIElementTypeFactory.createTokenSet(
			RexxLanguage.INSTANCE,
			RexxLexer.COMMENT,
			RexxLexer.CONTINUATION);

	public static final TokenSet WHITESPACE =
		PSIElementTypeFactory.createTokenSet(
			RexxLanguage.INSTANCE,
			RexxLexer.WHISPACES);

	public static final TokenSet STRING =
		PSIElementTypeFactory.createTokenSet(
			RexxLanguage.INSTANCE,
			RexxLexer.STRING);

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
				// start rule depends on root passed in; sometimes we want to create an ID node etc...
				if ( root instanceof IFileElementType ) {
					return ((RexxParser) parser).file();
				}
				// let's hope it's an ID as needed by "rename function"
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