package com.intellij.rexx;

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class RexxFileTypeFactory extends FileTypeFactory {
	@Override
	public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
		fileTypeConsumer.consume(RexxFileType.INSTANCE, RexxFileType.FILE_EXTENSION);
	}
}