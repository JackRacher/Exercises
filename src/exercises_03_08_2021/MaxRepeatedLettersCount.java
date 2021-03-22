package exercises_03_08_2021;

import java.util.Scanner;

public class MaxRepeatedLettersCount {

	static int maxBlock(String word) {
		int loopcount = 0, charcount = 0;
		for (int i = 0; i < word.length(); i++) {
			loopcount = 1;
			for (int j = (i + 1); j < word.length(); j++) {
				if(!(word.charAt(i) == word.charAt(j))) {
					break;
				}
				loopcount++;
			}
			if(loopcount > charcount) {
				charcount = loopcount;
			}
		}
		return charcount;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word to find max block: ");
		System.out.println(maxBlock(scanner.next()));
		scanner.close();
	}
}
