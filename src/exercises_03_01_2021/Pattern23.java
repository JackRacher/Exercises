package exercises_03_01_2021;

public class Pattern23 
{
	public static void main(String[] args) 
	{
		String res = "";
		int num = 5, temp = num;
		for (int row = 1; row <= 5; row++) 
		{
			for (int cols = 1; cols <= 5; cols++) 
			{
				
				res += num + " ";
				num--;
			}
			res += "\n";
			
			num = temp + 5;
			temp += 5;
		}
		System.out.println(res);

	}

}
