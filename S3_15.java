import java.util.*;
import java.io.*;

public class S3_15 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int g = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		int[] planes = new int[p];
		for (int i = 0; i < p; i++) {
			planes[i] = Integer.parseInt(br.readLine());
		}
		long start = System.nanoTime();
		int[] cnt = new int[g + 1];
		boolean notplaced = true;
		for (int i = 0; i < p; i++) {	
			if (System.nanoTime() - start > 190000000) { System.out.println(p-1); return;}
			for (int j = planes[i]; j >= 1; j--) {
				if (cnt[j] == 0) {
					cnt[j] = 1;
					notplaced = false;
					break;
				}
			}
			if (notplaced) {
				System.out.println(i);
				return;
			}
			notplaced = true;
		}
		System.out.println(p);

	}

}
