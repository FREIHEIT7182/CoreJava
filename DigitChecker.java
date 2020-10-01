package core_java;

public class DigitChecker {
		public static void main(String args[]){
		int n=Integer.parseInt(args[0]);
		int sub = n%10 - (n/10)%10;
		System.out.println("subtraction of digits of a number "+n+" is "+sub);
		}

}

