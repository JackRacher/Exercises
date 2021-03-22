package exercises_03_01_2021;

public class Pattern9 
{
	public static void main(String[] args) 
	{
		String res = "";
		for (int row = 1; row <= 5; row++) 
		{
			for (int cols = 5; cols >= row; cols--) 
			{
				res += row + " ";
			}
			res += "\n";
		}
		System.out.println(res);

	}


}
