import java.util.*;
import java.io.*;

public class S3_12 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[1001];
		Arrays.fill(arr, 0);

		int c;
		for (int i = 0; i < n; i++) {
			c = Integer.parseInt(br.readLine());
			arr[c] += 1;
		}
		int max = 0;
		int posmin = -1;
		int posmax = -1;
		int max2 = 0;
		int posmin2 = -1;
		int posmax2 = -1;
		for (int i = 1; i < 1001; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 1; i < 1001; i++) {
			if (arr[i] > max2 && arr[i] < max) {
				max2 = arr[i];
			}
		}
		for (int i = 1; i < 1001; i++) {
			if (arr[i] == max) {
				if (posmin == -1) {
					posmin = i;
				} else {
					posmax = i;
				}

			}
			if (arr[i] == max2) {
				if (posmin2 == -1) {
					posmin2 = i;
				} else {
					posmax2 = i;
				}
			}
		}

		if (posmax != -1) {
			System.out.println(Math.abs(posmax - posmin));
		} else if (posmax2 != -1) {
			if (Math.abs(posmin - posmin2) > Math.abs(posmin-posmax2)) {
				System.out.println(Math.abs(posmin - posmin2));
			} else {
				System.out.println(Math.abs(posmin - posmax2));
			}			
		} else {
			System.out.println(Math.abs(posmin-posmin2));
		}

	}

}
