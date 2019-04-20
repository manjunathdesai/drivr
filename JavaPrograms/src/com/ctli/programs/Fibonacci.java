package com.ctli.programs;

public class Fibonacci {
	
	public static void main(String arg[])
	{
		int n=5;
		int n1=0;
		int n2=1;
		System.out.println("output values");
		for(int i=0; i<=n; i++)
		{
			System.out.println("output values");
			int sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println("output values" +sum);
		}
	}

}
