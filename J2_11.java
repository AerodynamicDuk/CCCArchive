import java.io.*;
import java.util.*;

public class J2_11 {
    	public static int h;
	public static int cnt = 0;

	public static boolean test(int m) {
		for (int i = 1; i <= m; i++) {
			if (((-6 * i * i * i * i) + (h * i * i * i) + (2 * i * i) + i) <= 0) {
				cnt = i;
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		int m = sc.nextInt();
		if (test(m)) {
			System.out.println("The balloon first touches ground at hour: ");
			System.out.println(cnt);
		} else
			System.out.println("The balloon does not touch ground in the given time.");

	}
}
