package second;

import first.M;
import first.N;

public class Y extends N {
	public static void main(String[] args)
	{
		
		M m=new M();
		Y y=new Y();
		X x=new X();
		System.out.println("Display all the methods of class M and N");
		m.DispM();
		y.DispN();
		System.out.println("Display all the variables of class X");
		x.Dispall();
    }
	
	
}
