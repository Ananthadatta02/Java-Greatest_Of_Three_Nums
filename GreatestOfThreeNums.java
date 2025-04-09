package test_02_04_25;

import java.util.Scanner;

public class GreatestOfThreeNums 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int a = s.nextInt();
		System.out.println("Enter the 2nd Number");
		int b = s.nextInt();
		System.out.println("Enter the 3rd Number");
		int c = s.nextInt();
		if(a>b  && a>c)
			System.out.println("Greatest is " + a);
		else if(b>a  && b>c)
			System.out.println("Greatest is " + b);
		else
			System.out.println("Greatest is " + c);
	}
}
