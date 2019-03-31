package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] arr = {"1","2","3","4","5"};
		//2. print the third element in the array
		System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[2] = "three";
		//4. print the third element again
		System.out.println(arr[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		//6. make an array of 50 integers
		int [] _arr = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for(int i = 0; i < _arr.length; i++)
		{
			_arr[i] = rand.nextInt(10);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestNum = _arr[0];
		for(int i = 0; i < _arr.length; i++)
		{
			if(_arr[i] < smallestNum)
			{
				smallestNum = _arr[i];
			}
		}
		System.out.println(smallestNum);
		//9 print the entire array to see if step 8 was correct
		for(int i = 0; i < _arr.length; i++)
		{
			System.out.println(_arr[i]);
		}
		//10. print the largest number in the array.
		int biggestNum = _arr[0];
		for(int i = 0; i < _arr.length; i++)
		{
			if(_arr[i] > biggestNum)
			{
				biggestNum = _arr[i];
			}
		}
		System.out.println(biggestNum);
	}
}
