package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPhoneNumber {
	public static void main(String[] args) {
		String regex = "\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}";
		String text = "Call me at 1112223333 or 333-444-5555 or 999.999.9999";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()) {
			String s = matcher.group();
			System.out.println(s);
		}
		text = matcher.replaceAll("*");
//		System.out.println(text);
	}
}
