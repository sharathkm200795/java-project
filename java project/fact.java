import java.io.*;
import java.util.Scanner;
class fact
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int i,fact=1;
		System.out.println("enter the number");
		int num=scan.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of given number is"+fact);
	}
}