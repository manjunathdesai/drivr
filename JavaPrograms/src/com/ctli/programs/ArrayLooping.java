package com.ctli.programs;

public class ArrayLooping {
	
	public static void main(String arg[])
	{
		int[] a = {7,8,2,12,18,24};
		System.out.println("The index\t values");
		
		for(int count=0;count<a.length;count++)
		{
			System.out.println(count +"\t" +a[count]);
		}
	}

}
