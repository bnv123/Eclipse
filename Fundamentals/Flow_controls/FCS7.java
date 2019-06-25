package Flow_controls;
public class FCS7 {
	public static void main(String[] args) {
		char x=args[0].charAt(0);
		if(x>='a'&&x<='z') {
			System.out.println(Character.toUpperCase(x));
		}
		else {
			System.out.println(Character.toLowerCase(x));
		}
	}
}
