import java.util.*;
import java.io.*;
import java.util.Scanner;

class cal

{
	int res=0;
	public int AdditinCal(int x,int y)
	{
	 return res=x+y;
	}
}

class Arithmatic
{
public static void main(String[] arg)
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	a=sc.nextInt();
	System.out.println("Enter second number");
	b=sc.nextInt();
	cal c = new cal();
	c.AdditinCal(a,b);
	System.out.println("Addition of two numbers is : "+c.res);
}
}
