package exercises_03_01_2021;

import java.util.Scanner;

public class Armstrong_In_Range 
{
	static boolean isArmstrong(int num)
	{
		boolean b = false;
		int sum = 0, temp = num;
		int length = String.valueOf(num).length();
		while (num > 0) {
            int digit = num % 10;
            sum = (int) (sum + Math.pow(digit,length));
            num = num / 10;
        }
		if(temp == sum)
		{
			b = true;
		}
		return b;
	}
	
	static String armstrongList(int startValue, int endValue)
	{
		String res = "";
		for (int index = startValue; index <= endValue; index++) 
		{
			if(isArmstrong(index))
			{
				res += index + ",";
			}
			
		}
		if(res == "")
		{
			return "No Armstrong number in given range";
		}
		return res.substring(0, res.length()-1);
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range to find the armstrong between them: ");
		System.out.println(armstrongList(scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}

}
