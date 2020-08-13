package pkg1;

public class student {

	int age;
	int roll_number;
	public void display1()
	{
		System.out.println("welcome to all");
	}
public void display2()
{
	System.out.println("welcome students");
}
public static void main(String[] args) {
	student std = new student();
	std.display1();
    std.display2();
	std.age=20;
	std.roll_number=6;
	System.out.println(std.age);
	System.out.println(std.roll_number);
	
	
    student std2 =new student();
	std2.display1();
	std2.display2();
	std2.age=20;
	std2.roll_number=9;
	System.out.println(std2.age);
	System.out.println(std2.roll_number);
	
}
}