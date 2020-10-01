package core_java;

public class NumbersInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int start = Integer.parseInt(args[0]);
			int end = Integer.parseInt(args[1]);
			if (start >= 0 && end >= 0) {
				for (int i = start; i <= end; i++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}

			else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}
