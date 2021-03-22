package exercisees_03_02_2021;

public class DecimalToBinary {

	public static void main(String[] args) 
	  { 
	   int num = 20,rem;
	   String str = "", rev = "";
	   while(num > 0)
	   {
	   		rem = num % 2;
	        str = str + rem;
	        num = num/2;
	   }
	   for(int i = str.length()-1; i >= 0; i--)
	   {
	   		rev = rev + str.charAt(i);
	   }
	   System.out.println(rev);
	  }
}
