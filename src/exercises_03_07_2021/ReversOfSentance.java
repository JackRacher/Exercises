package exercises_03_07_2021;

import java.util.Scanner;

public class ReversOfSentance {

	static String getReverse(String sentance) {
		String res = "";
		String[] array = sentance.split(" ");
		for (int i = 0; i < array.length; i++) {
			String word = reverse(array[i]);
			res += word + " ";
		}
		return res.substring(0, res.length()-1);
	}
	
	static String reverse(String word) {
		String res = "";
		for (int i = word.length()-1; i >= 0; i--) {
			if(i == word.length()-1) {
				res += word.toUpperCase().charAt(i);
				continue;
			}
			res += word.charAt(i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentance to see the revers of it: ");
		String sentance = scanner.nextLine();
		System.out.println(getReverse(sentance));
		scanner.close();
	}
}
