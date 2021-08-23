package FifthAssignment;

public class StringDemo {
	public static void main(String args[])
	{
	String t="Delhi";
	String o="Mumbai";
	String k="Delhi";
	String y=new String("Mumbai");
	String l=new String("delhi");
	String p=new String("Hello");
	
		System.out.println(o.equals(l));
		System.out.println(y.equals(p));
		System.out.println(t.equals(o));
		System.out.println(k.equals(y));
		System.out.println(p.equals(y));
	
	if(o==l)
		System.out.println("true");
	else
	System.out.println("false");

	if(y==p)
		System.out.println("true");
	else
	System.out.println("false");

	if(t==o)
		System.out.println("true");
	else
	System.out.println("false");

	if(k==y)
		System.out.println("true");
	else
	System.out.println("false");

	if(p==y)
		System.out.println("true");
	else
	System.out.println("false");
	
	}
}


