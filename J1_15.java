import java.util.*;
public class J1_15 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner (System.in);		
		int m = sc.nextInt();		
		if (m < 2) {
			System.out.println("Before");
			return;
		} else if (m > 2) {
			System.out.println("After");
			return;
		} else {
			int d = sc.nextInt();
			
			if (d < 18) {
				System.out.println("Before");
				return;
			} else if (d > 18) {
				System.out.println("After");
				return;
			} else {
				System.out.println("Special");
				return;
			}
		}
	}
}
