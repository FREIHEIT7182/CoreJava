package core_java;

public class BooleanValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Boolean b1 = Boolean.parseBoolean(args[0]);
			Boolean b2 = Boolean.parseBoolean(args[1]);
			Boolean b3 = Boolean.parseBoolean(args[2]);
			int c = 0;
			if (b1) {
				c++;
			}
			if (b2) {
				c++;
			}
			if (b3) {
				c++;
			}
			if (c >= 2) {
				System.out.println("true");
			} else {
				System.out.println("False");
			}
	

	}

}
