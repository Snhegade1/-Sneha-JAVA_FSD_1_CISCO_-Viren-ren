package Assignment8;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexExample 
{
	public static void main(String args[])
	{
		System.out.println (Pattern.matches("[a-zA-Z0-9]*[@][a-zA-Z0-9_.]*.com", "snehahegade2@gmail.co.com"));
		System.out.println (Pattern.matches("[a-zA-Z0-9]*[@][a-zA-Z0-9_.]*.com", "sneha,edu.com"));
		System.out.println (Pattern.matches("[a-zA-Z0-9]*[@][a-zA-Z0-9_.]*.com", "sneha@gmail.com"));

		System.out.println (Pattern.matches("[+]91[0-9]{10}", "+91853081688"));

		System.out.println (Pattern.matches("[A-Z][0-9]{3}[a-zA-Z]{10}", "SnehaHegade@12345"));

	}
}
