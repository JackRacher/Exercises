package exercisees_03_02_2021;

public class Addition {
	
	static int[][] getSum(int[][] a, int[][] b){
		int[][] c = new int[2][2];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	public static void main(String[] args) {
		int[][] a = {{1,2},{4,5}};
		int[][] b = {{1,2},{4,5}};
		
		for (int[] row : getSum(a, b)) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

}
