package java.com.intellij.rexx;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RexxFileType extends LanguageFileType {
	public static final String FILE_EXTENSION = "rexx";
	public static final RexxFileType INSTANCE = new RexxFileType();

	protected RexxFileType() {
		super(RexxLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "Rexx file";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "Rexx language source file";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return FILE_EXTENSION;
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return Icons.REXX_ICON;
	}
}