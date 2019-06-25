package Flow_controls;
public class FCS17 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int rn=0,v;
		while(n>0) {
			v=n%10;
			rn=(rn*10)+v;
			n/=10;
		}
		System.out.println(rn);
	}
}
