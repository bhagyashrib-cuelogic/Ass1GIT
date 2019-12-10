import java.util.*;
import java.io.*;
import java.util.Scanner;

class cal

{
	int res=0;
	int sub=0;
	int mul=0;
	public int AdditinCal(int x,int y)
	{
	 return res=x+y;
	}
	public int SubtractionCal(int x,int y)
	{
	    if(x>=y)
	     {
	        return sub=x-y;
	     }
	    else
	     {
		 return sub=y-x;
	     }
	public int MultiplicationCal(int x,int y)
	{
	 return mul=x*y;
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
	c.SubtractionCal(a,b);
	c.MultiplicationCal(a,b);

	System.out.println("Addition of two numbers is : "+c.res);
	System.out.println("Subtraction of two numbers is : "+c.sub);
	System.out.println("Multiplication of two numbers is : "+c.mul);

}
}
