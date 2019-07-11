import java.util.*;

public class S2_17 {

	public static void bubbleSort(int ar[]) {
		for (int i = (ar.length - 1); i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (ar[j - 1] > ar[j]) {
					int temp = ar[j - 1];
					ar[j - 1] = ar[j];
					ar[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}

		bubbleSort(list);
		
		int k = n / 2;
		int[] low;
		int[] high;

		low = new int[k + (n % 2)];
		high = new int[k];

		int q = 0;
		for (int i = low.length - 1; i >= 0; i--) {
			low[q] = list[i];
			//System.out.println(low[q]);
			q++;
		}
		System.out.println();

		q = 0;
		for (int i = list.length - k; i < list.length; i++) {
			high[q] = list[i];
			//System.out.println(high[q]);
			q++;
		}

		int cn = 0;
		int ct = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				System.out.print(low[cn] + " ");
				cn++;
				continue;
			}

			System.out.print(high[ct] + " ");
			ct++;
		}

	}

}
