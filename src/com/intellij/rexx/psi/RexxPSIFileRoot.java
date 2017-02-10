package com.intellij.rexx.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import org.antlr.jetbrains.adaptor.SymtabUtils;
import org.antlr.jetbrains.adaptor.psi.ScopeNode;
import com.intellij.rexx.Icons;
import com.intellij.rexx.RexxFileType;
import com.intellij.rexx.RexxLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RexxPSIFileRoot extends PsiFileBase implements ScopeNode {
	public RexxPSIFileRoot(@NotNull FileViewProvider viewProvider) {
		super(viewProvider, RexxLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public FileType getFileType() {
		return RexxFileType.INSTANCE;
	}

	@Override
	public String toString() {
		return "Rexx Language file";
	}

	@Override
	public Icon getIcon(int flags) {
		return Icons.REXX_ICON;
	}

	/** Return null since a file scope has no enclosing scope. It is
	 *  not itself in a scope.
	 */
	@Override
	public ScopeNode getContext() {
		return null;
	}

	@Nullable
	@Override
	public PsiElement resolve(PsiNamedElement element) {
//		System.out.println(getClass().getSimpleName()+
//		                   ".resolve("+element.getName()+
//		                   " at "+Integer.toHexString(element.hashCode())+")");
		if ( element.getParent() instanceof InstructionSubtree ) {
			return SymtabUtils.resolve(this, RexxLanguage.INSTANCE,
				element, "/script/function/ID");
		}
		return SymtabUtils.resolve(this, RexxLanguage.INSTANCE,
			element, "/script/vardef/ID");
	}
}