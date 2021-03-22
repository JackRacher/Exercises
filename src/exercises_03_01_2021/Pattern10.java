package exercises_03_01_2021;

public class Pattern10 
{
	public static void main(String[] args) 
	{
		String res = "";
		char ch = 'A';
		for (int row = 1; row <= 5; row++) 
		{
			for (int cols = 1; cols <= row; cols++) 
			{
				res += ch + " ";
				ch++;
			}
			res += "\n";
		}
		System.out.println(res);

	}

}
