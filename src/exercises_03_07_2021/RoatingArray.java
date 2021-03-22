package exercises_03_07_2021;

import java.util.Scanner;

public class RoatingArray {

	static int[] rotateArray(int[] list, int position) {
		int[] rotatedList = list.clone();
		int length = list.length;
		int front = 0, rare = position;
		if(length == position) {
			return list;
		}
		else if(position > length) {
			rare = position - length;
		}
		
		for (int i = 0; i < length; i++) {
			if(rare < length) {
				rotatedList[rare] = list[i];
				rare++;
			}
			else {
				rotatedList[front] = list[i];
				front++;
			}
		}
		return rotatedList;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the list of numbers to rotate\nEnter the Size of list:");
		int size = scanner.nextInt();
		int[] list = new int[size];
		System.out.println("Enter " + size + "numbers in the list: ");
		for (int i = 0; i < list.length; i++) {
			list[i] = scanner.nextInt();
		}
		System.out.println("Enter the number of postions you want to shift: ");
		for (int i : rotateArray(list, scanner.nextInt())) {
			System.out.print(i + " ");
		}
		scanner.close();
		
	}
}
