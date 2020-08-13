package pkg1;

import java.util.Scanner;

public class Ifelse {
	
	public void check(int i)
	{
	
		if(i%2==0) {
			System.out.println("even number");
		}
			else
			{
				System.out.println("odd number");
			}    }
	
	public static void main(String[] args) {
		Ifelse ref= new Ifelse();
		System.out.println("enter the number");
		Scanner s =new Scanner(System.in);
		int r=s.nextInt();
		ref.check(r);
	}
}

