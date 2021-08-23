package programm.in;


public class Student {
	
	String name;
	int age;
	char section;
	char gender;
	int sub1,sub2,sub3,total;
	float percent;
	Student(String n,int a,char s,char g,int sb1,int sb2,int sb3)
	{
		name=n;
		age=a;
		section=s;
		gender=g;
		sub1=sb1;
		sub2=sb2;
		sub3=sb3;
	}
	Student(String n, int a, char g, char s, int sb2, int sb3) {
		name = n;
		age = a;
		gender = g;
		section = s;
		sub2=sb2;
		sub3=sb3;
		}
	public void cal()
	{
		
		total=sub1+sub2+sub3;
		percent=(total*100)/300;
		System.out.println("Name: "+name+ " Age: "+age+ " Gender: " +gender+ " Section: "+section);
		System.out.println("Total Marks  :"+total);
		System.out.println("Percentage :"+percent);
		
		
	}
	public static void main(String args[])
	{
		Student s1=  new Student("sneha",20,'A','F',75,80,90);
	    Student s2 = new Student("shyam",20,'C','M',50,55);
		Student s3 = new Student("Radha",20,'D','F',60,65);
		Student s4=new Student("Tom",20,'B','M',60,75,80);
		s1.cal();
		s2.cal();
		s3.cal();
		s4.cal();
			
	}
	

}
