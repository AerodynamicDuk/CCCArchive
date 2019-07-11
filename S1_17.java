import java.util.*;
public class S1_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int[] t = new int[n];
		for (int i = 0; i < n;i++) {
			int k = sc.nextInt();
			if (i == 0) {
				t[i] = k;
				continue;
			}
			t[i] = k + t[i-1];
		}
		int cnt = 0;
		int max = 0;
		for (int i = 0; i < n;i++) {
			int k = sc.nextInt();
			cnt += k;
			if (cnt == t[i]) {
				max = i+1;
				
			}
		}
		
		System.out.println(max);
		
		
		
	}

}
