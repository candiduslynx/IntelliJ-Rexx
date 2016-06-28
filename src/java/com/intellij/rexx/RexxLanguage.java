package java.com.intellij.rexx;

import com.intellij.lang.Language;

public class RexxLanguage extends Language {
	public static final RexxLanguage INSTANCE = new RexxLanguage();

	private RexxLanguage() {
		super("Rexx");
	}
}