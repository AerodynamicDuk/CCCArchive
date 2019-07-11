import java.util.*;
public class J2_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();		
		for (int i = 0 ; i < n;i++) {
			String p = sc.next();
			
			while(p.length() > 1) {
				p = Integer.toString(sum(p));			
			}
			System.out.println(p);
		}		
	}
	
	public static int sum(String k) {
		if (k.equals("")){
			return 0;
		}
		return Integer.parseInt(k.substring(0,1)) + sum(k.substring(1));
		
	}
}
