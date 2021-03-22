package exercises_03_07_2021;

import java.util.Scanner;

public class CheckValidEmailID {

	static String isValidMailID(String mailID) {
		String res = "vaild";
		if(mailID.charAt(0) == mailID.toUpperCase().charAt(0)) {
			return "-1";
		}
		else if(!mailID.contains("@")) {
			return "-2";
		}
		
		else if(!(mailID.substring(mailID.length()-6, mailID.length()).contains(".com"))){
			if(!((mailID.substring(mailID.length()-6, mailID.length()).contains(".co.in")))) {
				return "-4";
			}
		}
		else if(!(mailID.contains("_"))) {
				if( !(mailID.contains("."))){
					return "-5";
				}
			
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the emailID: ");
		System.out.println(isValidMailID(scanner.next()));
		scanner.close();
	}
}
