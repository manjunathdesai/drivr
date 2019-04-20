package com.ctli.programs;

public class Arrays {
	
	public static void main(String args[])
	{
		int[] array = new int[10]; // Array will initialize the value from 0 to 9 before itself
		
		array[0]=5;
		array[1]=12;
		array[6]=14;
		array[9]=21;
		//array[10]=44; // it will throw arranyindex out of
		//bound exception as you initialized
		// for 10 and it reads value from 0 to 9
		System.out.println("The array values " +array[0]);
		System.out.println("The array values " +array[1]);
		
	}

}
