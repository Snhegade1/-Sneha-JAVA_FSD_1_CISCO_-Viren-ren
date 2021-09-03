package Assignment7;
class Monkey
{
	void jump()
	{
		System.out.println("Inside jump method");
	}
	void bite()
	{
		System.out.println("Inside bite method");
	}
}
interface Animal
{
	public void eat();
	public void sleep();
}
public  class Human extends Monkey implements Animal {
	public void eat()
	{
		System.out.println("Inside eat method");
		
	}
	public void sleep()
	{
		System.out.println("Inside eat method");
		
	}
	void jump()
	{
		System.out.println("Inside jump method");
	}
	void bite()
	{
		System.out.println("Inside bite method");
	}
	public static void main(String args[])
	{
		Human h=new Human();
		//Monkey m=new Monkey();
		//m.jump();
		//m.bite();
		h.eat();
		h.sleep();
		h.jump();
		h.bite();
	}


}
