import java.util.*;

public class J3_13 {

	public static boolean check(String k) {
		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < k.length(); i++) {
			if (list.contains(k.charAt(i))) {
				return false;
			}

			list.add(k.charAt(i));

		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k = sc.next();
		int p = Integer.parseInt(k);
		while (true) {
			p++;
			if (check(String.valueOf(p))) {
				System.out.println(p);
				return;
			}
		}

	}

}
