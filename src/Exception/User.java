package Exception;

import java.util.Scanner;

public class User {
//variable declaration
String name;
int age;
//input reading
public void input()
{	Scanner sc=new Scanner(System.in);
	System.out.println("ente the user name");
	name=sc.nextLine();
		//exception code block
	try {
			System.out.println("enter the user age");
			age=sc.nextInt();
			if(age<0)
			{
				throw new NegativeAgeException(); //throw exception to user defined exception class
			}
			System.out.printf("user name is :"+name);
			System.out.printf("\nuser age is :"+age);
	}
	catch(NegativeAgeException ae) //exception handling
	{
		ae.printStackTrace();//printing exception details
	}
}
public static void main(String args[])
{
	User obj=new User();
	obj.input();
	
	
}
}
