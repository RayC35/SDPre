public class Objective8Lab2 {
	public static void main(String[] args) {
		int sum = 0;

		for (int control = 0; control <= 20; control += 1) {
			sum = control + sum;
		}
		System.out.println(sum);
	}
}