package pkg1;

public class Cons 
{ 

	public Cons()
	{
	System.out.println("this is default constructor");
	}
public  Cons(int a)
{
	this(1,2);
	System.out.println("this is one parameterised constructor");
	}
public Cons(int a,int b)
{   this();
	System.out.println("this is 2 para meterised constructor");
	
}
public static void main(String[] args) {
Cons as = new Cons(12);

}
}


