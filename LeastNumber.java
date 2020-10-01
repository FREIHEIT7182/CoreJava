package core_java;

public class LeastNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			int min=((n1<n2)?n1:n2);
			System.out.println(min);
		}
		catch (Exception e) {
			System.out.println("Error");
		}
	}

}
