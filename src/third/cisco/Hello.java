package third.cisco;

abstract class MNC
{
	MNC()
	{
		System.out.println("Inside MNC Constructor");
	}
	abstract void stop1();
	abstract void stop2();
	public void run()
	{
		System.out.println("Inside the normal method of MNC class");
	}
}
abstract class Infosys extends MNC
{
	abstract void stop1();
	public void stop2()
	{
		System.out.println("Impletation of stop2 method");
	}
}

public class Hello extends Infosys {
	public void stop1()
	{
		System.out.println("Impletation of stop1 method");
	}

	public void stop3()
	{
		System.out.println("This is method of Hello Class");
	}
	public static void main(String args[])
	{
		Infosys i=new Hello();
		Hello h=new Hello();
		i.run();
		i.stop1();
		i.stop2();
		h.stop3();
		
		
	}

}
