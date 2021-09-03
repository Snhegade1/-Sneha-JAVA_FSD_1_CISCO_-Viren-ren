package Assignment7;
abstract class Pen
{
	abstract void write();
	abstract void refill();
}
public class fountainPen {
	void nib()
	{
		System.out.println("Inside nib() method");
	}
	void write()
	{
		System.out.println("Inside write() method");
	}
	void refill()
	{
		System.out.println("Inside refill() method");
	}
	public static void main(String args[])
	{
	fountainPen fp=new fountainPen();
	fp.nib();
	fp.write();
	fp.refill();
	}
	

}
