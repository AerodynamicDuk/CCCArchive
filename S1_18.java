import java.util.*;

public class S1_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < num; i++) {
			int t = sc.nextInt();
			if (list.isEmpty()) {
				list.add(t);
				continue;
			}

			for (int j = 0; j < list.size(); j++) {
				if (t < list.get(j)) {
					list.add(j, t);
					break;
				}

				if (j == list.size() - 1) {
					list.add(t);
					break;
				}
			}

		}
		double min = 0;
		for (int i = 1; i < list.size() - 1; i++) {
			int temp = Math.abs((list.get(i + 1) - list.get(i)) + (list.get(i) - list.get(i - 1)));
			if (i == 1) {
				min = temp;
			}
			if (temp < min) {
				min = temp;
			}
		}

		System.out.printf("%.1f", min/2.0);

		sc.close();
	}

}
