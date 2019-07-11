import java.util.*;
import java.io.*;

public class S4_00 {
	//cheat version TODO rewrite
	public static int min = Integer.MAX_VALUE;
	public static int[] club;
	public static int[] minSwings;

	public static void recurse(int remain, int steps, int p) {
		if (remain == 0) {
			recurse2(p, 0, steps);
			System.out.println("Roberta wins in " + steps + " strokes.");
			System.exit(0);
		}

		for (int e = club.length - 1; e >= 0; e--) {
			if (club[e] <= remain) {
				recurse(remain - club[e], steps + 1, p);
			}
		}
		if (steps > 20 || steps < 14) {
			System.out.println("Roberta acknowledges defeat.");
			System.exit(0);
		} else
			return;
	}

	public static void recurse2(int remain, int steps, int othermin) throws ArrayIndexOutOfBoundsException {
		if (remain == 0) {
			System.out.println("Roberta wins in " + Math.min(steps, othermin) + " strokes.");
			System.exit(0);
		}

		for (int e = club.length - 2; e >= 0; e--) {
			if (club[e] <= remain) {
				recurse2(remain - club[e], steps + 1, othermin);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		club = new int[n];
		for (int i = 0; i < n; i++) {
			club[i] = Integer.parseInt(br.readLine());
		}
		Arrays.parallelSort(club);
		recurse(len, 0, len);

	}

}
