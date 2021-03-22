package exercises_03_07_2021;

import java.util.Scanner;

public class MorrsCode {

	static String getMorsCode(String word) {
		String res = "";
		if(word.length() == 0) {
			return "Empty String";
		}
		for (int i = 0; i < word.length(); i++) {
			char ch = word.toUpperCase().charAt(i);
			switch (ch) {
				case 'A':
					res += ".-";
				break;
				case 'B':
					res += "-...";
					break;
				case 'C':
					res += "-.-.";
					break;
				case 'D':
					res += "-..";
					break;
				case 'E':
					res += ".";
					break;
				case 'F':
					res += "..-.";
					break;
				case 'G':
					res += "--";
					break;
				case 'H':
					res += "....";
					break;
				case 'I':
					res += "..";
					break;
				case 'J':
					res += ".---";
					break;
				case 'K':
					res += "-.-";
					break;
				case 'L':
					res += ".-..";
					break;
				case 'M':
					res += "--";
					break;
				case 'N':
					res += "-.";
					break;
				case 'O':
					res += "---";
					break;
				case 'P':
					res += ".--.";
					break;
				case 'Q':
					res += "--.-";
					break;
				case 'R':
					res += ".-.";
					break;
				case 'S':
					res += "...";
					break;
				case 'T':
					res += "-";
					break;
				case 'U':
					res += "..-";
					break;
				case 'V':
					res += "...-";
					break;
				case 'W':
					res += ".--";
					break;
				case 'X':
					res += "-..-";
					break;
				case 'Y':
					res += "-.--";
					break;
				case 'Z':
					res += "--..";
					break;
			default:
				return "Invalid Letter";
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word to find moors code of it : ");
		System.out.println(getMorsCode(scanner.next()));
		
		scanner.close();
	}
}
