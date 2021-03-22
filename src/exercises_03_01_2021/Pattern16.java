package exercises_03_01_2021;

public class Pattern16 
{
	public static void main(String[] args) 
	{
		String res = "";
		int even = 2;
		for (int row = 5; row >= 1; row--) 
		{
			for (int cols = 5; cols >= row; cols--) 
			{
				res += even +" ";
				even += 2;
			}
			res += "\n";
		}
		System.out.println(res);
	}

}
