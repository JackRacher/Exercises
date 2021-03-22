package exercises_03_07_2021;

import java.util.Scanner;

public class OccurenceCounter {

	public static int getCount(int[] givenArray, int givenNumber)
	{
		int count = 0;
			for (int index = 0; index < givenArray.length; index++) 
			{
				if(givenArray[index] == givenNumber)
				{
					count++;
				}
			}
		if(count == 0)
		{
			return -1;
		}
		return count;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int arraySize = scanner.nextInt();
		int[] array = new int[arraySize];
		System.out.println("Enter the " + arraySize + "  values: ");
		for (int index = 0; index < array.length; index++) 
		{
			array[index] = scanner.nextInt();
		}
		System.out.println("Enter the number you want to count in the array: ");
		int number = scanner.nextInt();
		int count = getCount(array, number);
			System.out.println(count);
		scanner.close();

	}
}
