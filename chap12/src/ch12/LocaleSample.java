package ch12;

import java.util.Locale;

public class LocaleSample {

	public static void main(String[] args) {
		Locale thai = new Locale("th", "TH");
		System.out.println(thai.getDisplayLanguage());
		System.out.println(thai.getDisplayCountry());
	}
}
