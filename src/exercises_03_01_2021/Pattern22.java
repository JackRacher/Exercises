package exercises_03_01_2021;

public class Pattern22 
{
	public static void main(String[] args) 
	{
		String res = "";
		char ch = ' ';
		for (int row = 1; row <= 5; row++) 
		{
			ch = '*';
			for (int cols = 1; cols <= 5; cols++) 
			{
				if(ch == '1')
				{
					ch = '*';
				}
				else
				{
					ch = '1';
				}
				res += ch + " ";
			}
			res += "\n";
		}
		System.out.println(res);

	}

}
