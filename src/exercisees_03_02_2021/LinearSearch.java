package exercisees_03_02_2021;

public class LinearSearch {

	static String linearSearch(int number, int[] numbers) {
		String res = "Not Found";
		for (int i = 0; i < numbers.length; i++) {
			if(number == numbers[i]) {
				res = "Fount in index " + (i + 1);
				break;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.println(linearSearch(3, arr));
	}
}
