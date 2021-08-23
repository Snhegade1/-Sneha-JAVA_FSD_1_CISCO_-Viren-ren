package four.cisco;
import java.io.*;
import java.util.*;
public class Main{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
LinkedHashSet l1=new LinkedHashSet();
TreeSet<String> t=new TreeSet<String>();
LinkedHashSet<Integer> l2=new LinkedHashSet<Integer>();
System.out.println("Enter 2 interger,2 float,2 char,2 boolean values");
l1.add(sc.nextInt());
l1.add(sc.nextInt());
l1.add(sc.nextFloat());
l1.add(sc.nextFloat());
l1.add(sc.next());
l1.add(sc.next());
l1.add(sc.nextBoolean());
l1.add(sc.nextBoolean());
System.out.println("values of L1:"+l1);
System.out.println("enter 8 integer values");
for(int i=1;i<=8;i++)
{
l2.add(sc.nextInt());
}
System.out.println("Values of L2: "+l2);
t.add("C");
t.add("CPP");
t.add("Java");
t.add("Python");
t.add("Go");
t.add("Data Stucture");
System.out.println(t.remove("CPP"));
System.out.println(t.remove("Python"));
System.out.println("After Removing:"+t);
t.add("ML");
t.add("IOT");
t.add("Rubby");
System.out.println("After adding 3 Languages:"+t);
System.out.println("Is Set contains java :"+t.contains("Java"));
t.clear();
System.out.println("After removing all elements From set:"+t);

}
}
