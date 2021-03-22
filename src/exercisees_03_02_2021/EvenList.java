package exercisees_03_02_2021;

import java.util.Scanner;

public class EvenList 
{

	public static int[] getEvenArray(int[] givenArray) 
	{
		int count = 0;
		if(givenArray.length >= 10)
		{
			for (int index = 0; index < givenArray.length; index++) 
			{
				if(givenArray[index] % 2 == 0)
				{
					count++;
				}
			}
			int[] evenArray = new int[count];
			count = 0;
			for (int index = 0; index < givenArray.length; index++) 
			{
				if(givenArray[index] % 2 == 0)
				{
					evenArray[count] = givenArray[index];
					count++;
				}
			}
			return evenArray;
		}
		else
		{
			return null;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array more than 10: ");
		int arraySize = scanner.nextInt();
		int[] array = new int[arraySize];
		System.out.println("Enter the " + arraySize + "  values: ");
		for (int index = 0; index < array.length; index++) 
		{
			array[index] = scanner.nextInt();
		}
		int[] resultArray = EvenList.getEvenArray(array);
		for (int index : resultArray) 
		{
			System.out.println(index);
		}
		scanner.close();
	}
}
