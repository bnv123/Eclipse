package Flow_controls;
public class FCS15 {
	public static void main(String[] args) {
		int n;
		n=Integer.parseInt(args[0]);
		int sum=0,r;
		while(n>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
	}
}
