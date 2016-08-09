package com.intellij.rexx.structview;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class RexxStructureViewRootElement extends RexxStructureViewElement {
	public RexxStructureViewRootElement(PsiFile element) {
		super(element);
	}

	@NotNull
	@Override
	public ItemPresentation getPresentation() {
		return new RexxRootPresentation((PsiFile)element);
	}
}