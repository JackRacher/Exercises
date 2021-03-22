package exercises_03_01_2021;

public class Pattern12 
{
	public static void main(String[] args) 
	{
		String res = "";
		for (int row = 5; row >= 1; row--) 
		{
			for (int cols = 5; cols >= row; cols--) 
			{
				res += "* ";
			}
			res += "\n";
		}
		System.out.println(res);
	}

}
