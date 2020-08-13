package pkg1;

public class Msum 
{
	int x, y,z;
	
     public void sum()
     { 	 
     z=x+y;
  	 System.out.println("enter the value");
	 }
     public static void main(String[] args) {
	Msum s=new Msum();
	   s.sum();
	   s.x=1;
	   s.y=12;
	   s.z=1+12;
	 System.out.println(s.z);
	
		
	}
}
