package com.ctli.programs;
import java.util.Random;

// video 30 need to go through again

// https://www.youtube.com/watch?v=pHxtKDENDdE

public class ArrayRandomNumber {
	public static void main(String args[])	
	{
		Random random = new Random();
		int freq[]= new int[7];
		
		for(int roll=1;roll<10;roll++)
		{
			++freq[1+random.nextInt(6)];
		}
		
		System.out.println("Face\tFrequency");
		for(int face=1;face<freq.length;face++)
		{
			System.out.println(face+"\t" +freq[face]);
		}

}
}
