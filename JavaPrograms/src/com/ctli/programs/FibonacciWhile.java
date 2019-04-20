package com.ctli.programs;

public class FibonacciWhile {

		public static void main(String args[])
		{
			int n=5;
			int n1=0;
			int n2=1;
			int i=0;
			while ( i<=n)
			{
				int sum=n2+n1;
				n1=n2;
				n2=sum;
				i++;
				System.out.println("The output values" +sum);
				
				
			}
		}
}
