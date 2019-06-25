package Flow_controls;
public class FCS8 {
	public static void main(String[] args) {
		String s=args[0];
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch=='R')||(ch=='B')||(ch=='G')||(ch=='O')||(ch=='Y')||(ch=='W')) {
				cnt++;
			}
		}
		if(cnt==s.length()) {
			for(int i=0;i<s.length();i++) {
				char c=s.charAt(i);
				switch(c) {
					case 'R':System.out.println("RED");
							 break;
					case 'B':System.out.println("BLUE");
							 break;
					case 'G':System.out.println("GREEN");
							 break;
					case 'O':System.out.println("ORANGE");
							 break;
					case 'Y':System.out.println("YELLOW");
							 break;
					case 'W':System.out.println("WHITE");
							 break;
					default:break;
				}
			}
		}
		else {
			System.out.println("InValid Code");
		}
	}
}
