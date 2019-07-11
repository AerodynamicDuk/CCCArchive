import java.util.*;

public class S2_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int type = sc.nextInt();
		int n = sc.nextInt();
		
		int[] d = new int[n];
		int[] p = new int[n];

		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		
		Arrays.sort(p);
		Arrays.sort(d);
		
		if (type == 1) {
			int tot = 0;
			for (int i = 0; i < n; i++) {
				tot += Math.max(d[i], p[i]);
			}
			System.out.println(tot);
		} else {
			int tot = 0;
			int[] temp = new int[n];
			for (int i = 0; i < n; i++) {
				temp[i] = d[n-1-i];
			}
			for (int i = 0; i < n; i++) {
				tot += Math.max(temp[i], p[i]);
			}
			System.out.println(tot);
		}
		sc.close();
		
	}

}
