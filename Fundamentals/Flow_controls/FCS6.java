package Flow_controls;
public class FCS6 {
	public static void main(String[] args) {
		String x=args[0];
		int n=Integer.parseInt(args[1]);
		if("Male".equals(x)) {
			if(n>=1&&n<=58) {
				System.out.println("the percentage of interest is 8.4%.");
			}
			else if(n<=100){
				System.out.println("the percentage of interest is 10.5%.");
			}
		}
		else{
			if(n>=1&&n<=58) {
				System.out.println("the percentage of interest is 8.2%.");
			}
			else {
				System.out.println("the percentage of interest is 9.2%.");
			}
		}
	}
}
