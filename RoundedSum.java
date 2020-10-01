package core_java;

public class RoundedSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int n3 = Integer.parseInt(args[2]);

			int t1 = check(n1);
			int t2 = check(n2);
			int t3 = check(n3);
			System.out.println(t1 + " " + t2 + " " + t3);
			System.out.println(t1 + t2 + t3);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

	private static int check(int n) {
		int t = n;
		int f = n % 10;

		if (f >= 5)
			return ((t / 10) + 1) * 10;
		else {
			return (n / 10) * 10;
		}
	}

}
