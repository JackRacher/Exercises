package exercises_03_01_2021;

public class Pattern15 
{
	public static void main(String[] args) 
	{
		String res = "";
	
		for (int rows = 1; rows <= 5; rows++) 
		{
			for (int columns = 1; columns <=5 ; columns++) 
			{
				if(rows == 1 || rows == 5 || columns == 1 || columns == 5)
				{
					res += "* ";
				}
				else
				{
					res += "  ";
				}
				
			}
			res += "\n";
		}
		System.out.println(res);

	}
}

