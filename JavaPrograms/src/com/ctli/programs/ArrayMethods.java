package com.ctli.programs;

public class ArrayMethods 
{
	public static void main(String args[])
	{
		int array[] ={5,10,15,20,25};
		change(array);
		for(int y:array)
		System.out.println(y);
	}


	
	public static void change(int x[])
	{
		for(int count=0;count<x.length;count++)
		
			x[count]+=5;
		
	}
}