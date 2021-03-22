package exercises_03_01_2021;

public class Pattern24 
{
	public static void main(String[] args) 
	{
		String res = "";
	    for (int row = 1; row <= 4; row++ )
	    {
	        for(int column = 1; column <= 7; column++)
	        {
	            if(5 - row <= column && row + 3 >= column)
	            {
	                res += "1 ";
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
