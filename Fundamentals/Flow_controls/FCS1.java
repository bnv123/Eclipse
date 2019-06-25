package Flow_controls;
public class FCS1 {
	public static void main(String[] args) {
		int n;
		n=Integer.parseInt(args[0]);
		if(n==0) {
			System.out.println("The Number is Zero.");
		}
		else if(n>0) {
			System.out.println("The nnumber is Positive.");
		}
		else {
			System.out.println("The number is Negative.");
		}
	}
}
