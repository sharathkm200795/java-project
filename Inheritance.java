import java.io.*;
class A
{
	void displaya()
	{
		System.out.println("class A");
	}
}
class B extends A
{
	void displayb()
	{
		System.out.println("class B");
	}
}
class C extends B
{
	void displayc()
	{
		System.out.println("class C");
	}
}
class Inheritance
{
	public static void main(String[]args)	
	{
		C n=new C();
		n.displaya();
		n.displayb();
		n.displayc();
	}
}