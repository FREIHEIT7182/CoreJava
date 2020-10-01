package core_java;

public class SignFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int n = Integer.parseInt(args[0]);
			if (n == 0)
				System.out.println("Zero");
			else if (n > 0) {
				if (n % 2 == 0)
					System.out.println("Positive");
				else
					System.out.println("Negative");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
