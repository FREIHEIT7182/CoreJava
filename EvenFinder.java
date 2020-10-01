package core_java;

public class EvenFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
        	 int n=Integer.parseInt(args[0]);
        	 String s=((n%2==0)?"true":"false");
        	 System.out.println(s);
         }
         catch (Exception e) {
        	 System.out.println("Error");
		}
	}

}
