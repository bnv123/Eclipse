package Flow_controls;
public class FCS14 {
	public static void main(String[] args) {
		int n;
		if(args.length==0) {
			System.out.println("Please enter an integer number");
		}
		else {
			n=Integer.parseInt(args[0]);
			if(n==0) {
				System.out.println("0 is neither prime nor composite");
			}
			else if(n==1) {
				System.out.println("1 is neither prime nor composite");
			}
			else {
				int cnt=1;
				 if(n<2)
			            cnt=0;
			        if(n==2||n==3)
			            cnt=1;
			        if(n%2==0||n%3==0)
			            cnt=0;
			        for( int i=5;i<=Math.sqrt(n);i+=6)
			        {
			            if(n%i==0||n%(i+2)==0)
			                cnt=0;
			        }
				if(cnt==1){
					System.out.println(n + " is a Prime Number.");
				}
				else {
					System.out.println(n + " is not a Prime Number.");
				}
			}
		}
	}
}
