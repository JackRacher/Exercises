package exercises_03_01_2021;

public class Pattern7 
{
	public static void main(String[] args) 
	{
		String res = "";
		int num = 1;
		for (int row = 1; row <= 5; row++) 
		{	num = row;
			for (int cols = 1; cols <= row; cols++) 
			{
				res += num + " ";
				num++;
			}
			res += "\n";
		}
		System.out.println(res);

	}


}
