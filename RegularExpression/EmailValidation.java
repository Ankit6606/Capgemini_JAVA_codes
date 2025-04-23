package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		String email = "ankitdey@gmail.com ankit";
		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);//Compare the entire regular expression with the string email
		boolean res = matcher.matches();
		if(res)
			System.out.println("Email valid");
		
		else
			System.out.println("Invalid email");
		
	}
}
