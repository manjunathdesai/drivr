package com.ctli.programs;

public class ArraySum {
	
	public static void main(String args[])
	{
		int[] a = {1,5,10,20,30,40};
		int sum=0;
		for(int count=0;count<a.length;count++)
		{
			sum=sum+a[count];
		}
		System.out.println("The total of array is "+sum);
	}

}
