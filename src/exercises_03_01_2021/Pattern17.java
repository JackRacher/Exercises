package exercises_03_01_2021;

public class Pattern17 
{
	public static void main(String[] args) 
	{
		String res = "";
		for (int row = 0; row <= 4; row++) 
		{
			for (int cols = 0; cols <= row; cols++) 
			{
				res += cols + " ";
			}
			res += "\n";
		}
		System.out.println(res);
	}

}
