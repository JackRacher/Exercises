package exercises_03_07_2021;

import java.util.Scanner;

public class PalindromeOfString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = scanner.next(), revers = "";
		
		for (int i = name.length()-1; i >= 0; i--) {
			revers += name.charAt(i);
		}
		if(name.equals(revers)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		scanner.close();
	}
}
