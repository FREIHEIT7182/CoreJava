package core_java;

public class Rounder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n = Integer.parseInt(args[0]);
			if (n > 0) {
				if (n % 2 == 0) {
					System.out.println(((n / 10) + 1) * 10);
				} else {
					System.out.println(n);
				}
			} else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}
