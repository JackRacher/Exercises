package exercises_03_01_2021;

public class Pattern8 
{
	public static void main(String[] args) 
	{
		String res = "";
		int num = 1;
		for (int row = 5; row >= 1; row--) 
		{
			for (int cols = 5; cols >= row; cols--) 
			{
				res += num + " ";
				num++;
			}
			res += "\n";
		}
		System.out.println(res);
	}

}
