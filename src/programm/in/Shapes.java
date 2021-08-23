package programm.in;

public class Shapes {
	int s,b,h;
	float r;
	
	 Shapes()
	{
		System.out.println("Inside Default Constructer");
	}
	Shapes(int i)
	{
		s=i;
	}
	Shapes(int i,int j)
	{
		b=i;
		h=j;
	}
	Shapes(float i)
	{
		r=i;
	}
	public void Display1()
	{
		System.out.println("Area of Square :"+s*s);
	}
	
	public void Display2()
	{
		System.out.println("Area of Rectanle :"+(b*h));
	}
	
	public void Display3()
	{
		System.out.println("Area of Circle :"+(0.14*r*r));
	}
	public void Area(int d1,int d2)
	{
		int rh=(1/2)*d1*d2;
		System.out.println("Area of Rhombus :"+rh);
	}
	public void Area()
	{
		int s1 = 5,s2=9;
		int tr=(1/2)*s1*s2;
		System.out.println("Area of Trianle :"+tr);
	}
	public static void main(String args[])
	{
		Shapes s=new Shapes();
		Shapes s1=new Shapes(5);
		s1.Display1();
		Shapes s2=new Shapes(8,4);
		s2.Display2();
		Shapes s3=new Shapes(8.0f);
		s3.Display3();
		s.Area();
		s.Area(4,7);
	}
	
	

}
