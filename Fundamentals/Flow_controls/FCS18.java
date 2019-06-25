package Flow_controls;
public class FCS18 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int t=0,rn=0,v;
		t=n;
		while(n>0) {
			v=n%10;
			rn=(rn*10)+v;
			n/=10;
		}
		if(t==rn) {
			System.out.println(t + " is a palindrome");
		}
		else {
			System.out.println(t + " is not a palindrome");
		}
	}
}
