package Flow_controls;
public class FCS19 {
	public static void main(String[] args) {
		int i=1;
		int cnt=0;
		for(;cnt<5;i++) {
			if((i%2==0)&&(i%3==0)&&(i%5==0)) {
				cnt++;
				System.out.print(i+"\t");
			}
		}
	}
}
