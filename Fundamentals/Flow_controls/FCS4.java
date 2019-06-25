package Flow_controls;
public class FCS4 {
	public static void main(String[] args) {
		char x,y;
		x=args[0].charAt(0);
		y=args[1].charAt(0);
		if(x<y) {
			System.out.println(x+","+y);
		}
		else {
			System.out.println(y+","+x);
		}
	}
}
