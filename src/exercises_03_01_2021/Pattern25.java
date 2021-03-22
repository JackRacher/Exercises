package exercises_03_01_2021;

public class Pattern25 
{
	public static void main(String[] args) 
	{
		String res = "";
		int num = 10;
		for (int row = 1; row < 5; row++) 
		{
			for (int cols = 5; cols > row; cols--) 
			{
				res += num + " ";
				num--;
			}
			res += "\n";
		}
		System.out.println(res);

	}

}
