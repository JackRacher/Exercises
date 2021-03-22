package exercises_03_07_2021;

import java.util.Scanner;

public class WordsContain {

	static String[] getWordsContainPattern(String[] words, String pattern) {
		String wordsString = "";
		for (int i = 0; i < words.length; i++) {
			if(words[i].contains(pattern)) {
				wordsString += words[i] + ",";
			}
		}
		
		String[] wordsContailPattern = wordsString.substring(0, wordsString.length()-1).split(",");
		
		return wordsContailPattern;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of word you want to enter in the list: ");
		int size = scanner.nextInt();
		String[] words = new String[size];
		System.out.println("Enter " + size + " words: ");
		for (int i = 0; i < words.length; i++) {
			words[i] = scanner.next();
		}
		System.out.println("Enter the pattern you want to search in the words: ");
		
		for(String x : getWordsContainPattern(words, scanner.next())){
			System.out.println(x);
		}
		
		scanner.close();
	}
}
