package exercises_03_01_2021;

public class Pattern19 
{
	public static void main(String[] args) 
	{
		String res = "";
		int num = 16;
		for (int row = 1; row < 5; row++) 
		{
			for (int cols = 1; cols < 5; cols++) 
			{
				res += num + " ";
				num--;
			}
			res += "\n";
		}
		System.out.println(res);

	}

}
