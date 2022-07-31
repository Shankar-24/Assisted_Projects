package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		
		Pattern pat=Pattern.compile("Shankar.");
		Matcher match=pat.matcher("Shankar");
		Boolean b=match.matches();
		System.out.println(b);
		Pattern pat1=Pattern.compile("[a-z]");
		Matcher match1=pat1.matcher("h");
		Boolean c=match1.matches();
		System.out.println(c);

	}

}
