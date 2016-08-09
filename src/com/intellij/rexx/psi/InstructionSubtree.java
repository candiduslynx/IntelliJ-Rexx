package com.intellij.rexx.psi;

import com.intellij.lang.ASTNode;
import org.antlr.jetbrains.adaptor.psi.ANTLRPsiNode;
import org.jetbrains.annotations.NotNull;

public class InstructionSubtree extends ANTLRPsiNode {
	public InstructionSubtree(@NotNull ASTNode node) {
		super(node);
	}
}