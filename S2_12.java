import java.util.*;
import java.io.*;

public class S2_12 {

	public static int swap(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return Integer.MIN_VALUE;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		boolean lesser = false;
		int total = 0;
		int a, r;
		for (int i = s.length() - 1; i >= 1; i -= 2) {
			a = Integer.parseInt("" + s.charAt(i - 1));
			r = swap(s.charAt(i));

			if (lesser) {
				r = -1 * r;
				lesser = !lesser;
			}
			//System.out.println(a + " " + r);
			total += a * r;
			try {
				if (swap(s.charAt(i)) > swap(s.charAt(i - 2)))
					lesser = true;
			} catch (StringIndexOutOfBoundsException e) {
				continue;
			}
		}

		System.out.println(total);

	}

}
