package Assignment7;
import java.util.*;
import java.lang.*;
import java.io.*;
public class StringExample
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String A = s.toLowerCase();
		int len = A.length();
		boolean c = true;
		if(len<=50) {
		for (int i = 0; i < len/2; i++) {
		if (A.charAt(i) != A.charAt(len-1-i)) {
		c = false;
		}
		}
		System.out.println(c ? "Yes" : "No");
		}
		else {
		System.out.println("String should be contain minimum 50 letters");
		}
		sc.close();
		}

		}


