package Assignment7;
import java.util.*;
class ExceptionDemo {
	public int power(int n,int p) throws Exception 
	{
		if(n<0 || p<0)
			throw new Exception("n or p should not be negative");
		else if(n==0 && p==0)
			throw new Exception("n or p should not be zero");
		else
		{
			int pwr=(int) Math.pow(n, p);
			return pwr;
		}
		
			
	}

}
public class MyCalculator
{
	public static void main(String args[])
	{
		ExceptionDemo d=new ExceptionDemo();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		try
		{
			System.out.println(d.power(n, p));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}

