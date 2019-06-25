package Flow_controls;
public class FCS16 {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("Please enter an integer number");
		}
		else {
			int n;
			n=Integer.parseInt(args[0]);
			int i,j;
			for(i=1;i<=n;i++) {
				for(j=1;j<=i;j++) {
					System.out.print("*\t");
				}
				System.out.println("");
			}
		}
	}
}
