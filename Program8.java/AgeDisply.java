import java.util.Scanner;

class Father extends Exception 
{
	int f_age;
	Father(int a)
	{
		f_age=a;
	}
	public String toString()
	{
		return "wrong age";
	}
}
class Son extends Father
{
	int s_age;
	
	Son(int a,int b)
	{
		super(a);
		s_age=b;
	}
	public String toString()
	{
		return "wrong age";
	}
}


class exceptionmain
{
	static void check1(int a) throws Father 
	{
		System.out.println("father's age: "+a);
		if(a<0)
			throw new Father(a);
		System.out.println("father's age is valid");
	}
	static void check2(int a,int b) throws Son 
	{
		System.out.println("father's age: "+a);
		System.out.println("son's age: "+b);
		if(b>=a)
			throw new Son(a,b);
		System.out.println("son's and father's age is valid");
	}
	public static void main(String args[])
	{
		int a1,a2,a3;
		Scanner xx=new Scanner(System.in);
		try
		{
			System.out.println("enter the father's age");
			a1=xx.nextInt();
			check1(a1);
		}
		catch (Father e)
		{
			System.out.println("caught: "+e);
		}
		System.out.println();
		try
		{
			System.out.println("enter the father's age and son's age");
			a2=xx.nextInt();
			a3=xx.nextInt();
			check2(a2,a3);
		}
		
		catch (Son e)
		{
			System.out.println("caught: "+e );
		}
	}
}

