package exercises_03_07_2021;

public class ReversString {

	
	public static void main(String[] args) {
	
		String name = "OJAS", revers = "";
		
		for (int i = name.length()-1; i >= 0; i--) {
			revers += name.charAt(i);
		}
		System.out.println(revers);
	}
}
