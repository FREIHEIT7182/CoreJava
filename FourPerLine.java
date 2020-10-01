package core_java;

public class FourPerLine {
	public static void main(String[] args) {
		try {
			int n=Integer.parseInt(args[0]);
			int k = 1;
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					if (k <= n) {
						System.out.print(k + " ");
						k++;
					}

				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}
