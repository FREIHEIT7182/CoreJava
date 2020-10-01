package core_java;

public class RangeWithStep {
	public static void main(String[] args) {
		try {
			int fir=Integer.parseInt(args[0]);
			int sec=Integer.parseInt(args[1]);
			int inc=Integer.parseInt(args[2]);
			
			for(int i=fir;i<sec;i=i+inc) {
				System.out.println(i+" ");
			}
			System.out.println();
		}catch (Exception e) {
			System.out.println("Error");
		}
	}
}
