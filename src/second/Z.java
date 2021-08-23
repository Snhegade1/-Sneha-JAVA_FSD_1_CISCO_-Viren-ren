package second;

import first.M;
import first.N;

public class Z extends M {
	public static void main(String[] args)
	{
	
		X x=new X();
		Z z=new Z();
		N n=new N();
		System.out.println("Display all the methods of class M,N and P");
		z.DispM();
		n.DispN();
		System.out.println("Display all the variables of class X");
	    x.Dispall();
		
	}
	

}
