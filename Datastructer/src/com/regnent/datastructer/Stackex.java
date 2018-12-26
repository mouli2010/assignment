package com.regnent.datastructer;
import java.util.Arrays;
import java.util.Scanner;

public class Stackex {
	static int cursor=0;
	public static int[] pop(int[] array1,int cursor)throws StackdownflowException {
		int array2[]=new int[array1.length];

		if(cursor==0)
		{
			throw new StackdownflowException("stack is empty");
		}else{
		System.out.println(array1[cursor-1]);
		for (int i = 0; i <cursor-1; i++) {
			array2[i]=array1[i];
			
		}
		}
		return array2;
	}
	public static int push(int[] array1, int element,int cursor) throws StackoverflowException
	{
		if(array1.length==cursor)
		{
          throw new StackoverflowException("array is full");
	    }
		else{
			array1[cursor]=element;
			cursor++;
		}
		return cursor;
     }
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int array1[]=new int[5];
		System.out.println("push the array element");
		cursor=push(array1, 10,cursor);
		cursor=push(array1, 22,cursor);
		cursor=push(array1, 14,cursor);
		cursor=push(array1, 11,cursor);
		cursor=push(array1, 21,cursor);
		cursor=push(array1, 22,cursor);
		for (int i = 0; i <cursor; i++) {
			System.out.print(array1[i]+" ");	
		}
		System.out.println("\n pop the array element");
		array1=pop(array1,cursor);
		System.out.println("\n after poping array");
		for (int i = 0; i <cursor; i++) {
			System.out.print(array1[i]+" ");
			
		}
	}
	
}
