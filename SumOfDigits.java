package core_java;

public class SumOfDigits {

	public static void main(String args[]){
		int n=Integer.parseInt(args[0]);
		int sum = n%10 + (n/10)%10;
		System.out.println("Sum of digits of a number "+n+" is "+sum);
		
	}
}
