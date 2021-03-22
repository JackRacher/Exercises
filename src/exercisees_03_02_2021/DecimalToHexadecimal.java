package exercisees_03_02_2021;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) 
	  { 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the decimal number to find the Hexadecimal value: ");
	   int num = scanner.nextInt(),rem;
	   String str = "", rev = "";
	   while(num > 0)
	   {
	   		rem = num % 16;
	   		switch (rem) {
			case 10:
				str += 'A';
				break;
			case 11:
				str += 'B';
				break;
			case 12:
				str += 'C';
				break;
			case 13:
				str += 'D';
				break;
			case 14:
				str += 'E';
				break;
			case 15:
				str += 'F';
				break;
			default:
				str += rem; 
			}
	        num = num/16;
	   }
	   for(int i = str.length()-1; i >= 0; i--)
	   {
	   		rev = rev + str.charAt(i);
	   }
	   System.out.println(rev);
	   scanner.close();
	  }
	
}
