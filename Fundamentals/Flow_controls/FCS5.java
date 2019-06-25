package Flow_controls;
public class FCS5 {
	public static void main(String[] args) {
		char x;
		x=args[0].charAt(0);		
		if(x>='0'&&x<='9') {
			System.out.println("The Character "+ x + " is a Digit.");
		}
		else if((x>='a'&&x<='z')||(x>='A'||x<='Z')) {
			System.out.println("The Character "+ x + " is a Alphabet.");
		}
		else {
			System.out.println("Given character was a Special Character.");
		}
	}
}
