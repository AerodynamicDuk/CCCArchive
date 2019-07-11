import java.util.*;

public class S1_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k = sc.next();
		String s = sc.next();

		if (s.length() != k.length()) {
			System.out.println("N");
			return;
		}
		if (s.equals(k)) {
			System.out.println("A");
			return;
		}

		for (int i = 0; i < k.length(); i++) {
			char c = s.charAt(i);

			for (int j = 0; j < k.length(); j++) {
				if (k.charAt(j) == c) {
					k = k.substring(0, j) + "*" + k.substring(j + 1);
					s = s.substring(0, i) + "*" + s.substring(i + 1);
					break;
				}
			}

		}

		for (int i = 0; i < k.length(); i++) {
			if (s.charAt(i) != '*') {
				System.out.println('N');
				return;
			}
		}

		System.out.println("A");

	}

}
