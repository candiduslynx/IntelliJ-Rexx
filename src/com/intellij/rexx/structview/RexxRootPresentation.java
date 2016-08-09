package com.intellij.rexx.structview;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import com.intellij.rexx.Icons;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RexxRootPresentation implements ItemPresentation {
	protected final PsiFile element;

	protected RexxRootPresentation(PsiFile element) {
		this.element = element;
	}

	@Nullable
	@Override
	public Icon getIcon(boolean unused) {
		return Icons.REXX_ICON;
	}

	@Nullable
	@Override
	public String getPresentableText() {
		return element.getVirtualFile().getNameWithoutExtension();
	}

	@Nullable
	@Override
	public String getLocationString() {
		return null;
	}
}