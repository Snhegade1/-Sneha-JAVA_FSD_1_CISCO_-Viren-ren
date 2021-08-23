package programm.in;


public class Construct {
	public int Add(int a,int b)
	{
		int c=a+b;
		return c;
		
	}
	 public float Circle(int r)
	 {
		float ar=(float) (0.14*r*r);
		return ar;
	 }
	 public int Rect(int l,int b)
	 {
		 int re=l*b;
		 return re;
	 }
	 public static void main(String args[])
	 {
		 Construct c=new Construct();
		 int p=c.Add(10,10);
		 System.out.println("Addition of two numbers :"+p);
		 float q= c.Circle(5);
		 System.out.println("Area of Circle :"+q);
		 int r=c.Rect(5, 4);
		 System.out.println("Area of Rectangle :"+r);
	 }

}
