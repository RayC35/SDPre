public class Objective7Lab4 {
	public static void main(String[] args) {
		int sum = 0;
		int counter = 0;
		while (counter < 20) {
			counter = counter + 1;
			sum = counter + sum;
			if (counter == 20) {
				System.out.println(sum);
				}
			}
		}
	}