import java.io.*;
import java.util.*;

public class S1_05 {
  	public static String out = "";

	public static void test(int m) {
		out += m + "";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String k = sc.next();
			for (int j = 0; j < k.length(); j++) {
				switch (k.charAt(j)) {
				case 'A': {
					test(2);
					continue;
				}
				case 'B': {
					test(2);
					continue;
				}
				case 'C': {
					test(2);
					continue;
				}
				case 'D': {
					test(3);
					continue;
				}
				case 'E': {
					test(3);
					continue;
				}
				case 'F': {
					test(3);
					continue;
				}
				case 'G': {
					test(4);
					continue;
				}
				case 'H': {
					test(4);
					continue;
				}
				case 'I': {
					test(4);
					continue;
				}
				case 'J': {
					test(5);
					continue;
				}
				case 'K': {
					test(5);
					continue;
				}
				case 'L': {
					test(5);
					continue;
				}
				case 'M': {
					test(6);
					continue;
				}
				case 'N': {
					test(6);
					continue;
				}
				case 'O': {
					test(6);
					continue;
				}
				case 'P': {
					test(7);
					continue;
				}
				case 'Q': {
					test(7);
					continue;
				}
				case 'R': {
					test(7);
					continue;
				}
				case 'S': {
					test(7);
					continue;
				}
				case 'T': {
					test(8);
					continue;
				}
				case 'U': {
					test(8);
					continue;
				}
				case 'V': {
					test(8);
					continue;
				}
				case 'W': {
					test(9);
					continue;
				}
				case 'X': {
					test(9);
					continue;
				}
				case 'Y': {
					test(9);
					continue;
				}
				case 'Z': {
					test(9);
					continue;
				}
				case '-': continue;
				default:
					out += k.charAt(j);

				}

			}
			System.out.println(out.substring(0,3) + "-" + out.substring(3,6) + "-" + out.substring(6,10));
			out = "";
			sc.close();
		}

	}
}