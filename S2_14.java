import java.util.*;

public class S2_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		HashMap<String, String> pair = new HashMap<String, String>();
		HashMap<String, String> flippair = new HashMap<String, String>();
		String[][] names = new String[n][2];

		for (int i = 0; i < n; i++) {
			names[i][0] = sc.next();
		}

		for (int i = 0; i < n; i++) {
			names[i][1] = sc.next();

			if (names[i][0].equals(names[i][1])) {
				System.out.println("bad");
				return;
			}
			pair.put(names[i][0], names[i][1]);
			flippair.put(names[i][1], names[i][0]);
		}

		for (int i = 0; i < n; i++) {

			if (!pair.get(names[i][0]).equals(flippair.get(names[i][0]))) {
				System.out.println("bad");
				return;

			}

		}

		System.out.println("good");

	}

}
