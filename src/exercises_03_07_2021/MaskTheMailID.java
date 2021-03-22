package exercises_03_07_2021;

import java.util.Scanner;

public class MaskTheMailID {

	static String maskMailID(String mailID) {
		String maskID = "";
		int midValue = mailID.indexOf('@');
		for (int i = 0; i < mailID.length(); i++) {
			if(i >= 2 && midValue > i) {
				maskID += "X";
				continue;
			}
			maskID += mailID.charAt(i);
		}
		return maskID;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the emailID: ");
		System.out.println(maskMailID(scanner.next()));
		scanner.close();
	}
}
