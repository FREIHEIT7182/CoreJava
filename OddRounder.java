package core_java;

public class OddRounder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			int n = Integer.parseInt(args[0]);
			if (n >= 0) {
				int quo = n / 10;
				if (n % 2 == 0)
					System.out.println("Even Number");
				else
					System.out.println((quo + 1) * 10);
			} else
				System.out.println("Error");
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}
