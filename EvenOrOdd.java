package core_java;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n=Integer.parseInt(args[0]);
			if(n%2==0) {
				System.out.println("Even Number");
			} else {
				System.out.println("");
			}
		}catch (Exception e) {
			System.out.println("Error");
		}
		
	}

}
