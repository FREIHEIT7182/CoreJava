package core_java;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			int max=((n1>n2)?n1:n2);
			System.out.println(max);
		}
		catch (Exception e) {
			System.out.println("Error");
		}
	}

}
