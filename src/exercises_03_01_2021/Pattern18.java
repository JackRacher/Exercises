package exercises_03_01_2021;

public class Pattern18 
{
	public static void main(String[] args) 
	{
		String res = "";
		int num = 1;
		for (int row = 1; row <= 5; row++) 
		{
			if(row % 2 == 0)
			{
				num = 0;
			}
			else
			{
				num = 1;
			}
			for (int cols = 1; cols <= 5; cols++) 
			{
				res += num + " ";
			}
			res += "\n";
		}
		System.out.println(res);

	}

}
