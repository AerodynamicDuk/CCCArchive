import java.util.*;

public class S3_03 {

	static int l;
	static int w;
	static boolean[][] floor;
	static int cnt = 0;
	static boolean first;
	static boolean firstprime = false;
	static int size = 0;
	static LinkedList<Integer> list = new LinkedList<>();

	public static void recurse(int a, int b) {

		if (a >= l || a < 0 || b >= w || b < 0)
			return;
		if (!floor[a][b])
			return;
		if (first) {
			cnt++;
			size = 0;
			first = false;
			firstprime = true;
			// System.out.println(a + "," + b);
		}

		size++;
		floor[a][b] = false;
		recurse(a + 1, b);
		recurse(a - 1, b);
		recurse(a, b + 1);
		recurse(a, b - 1);
		return;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int f = sc.nextInt();
		l = sc.nextInt();
		w = sc.nextInt();
		floor = new boolean[l][w];

		for (int i = 0; i < l; i++) {
			String k = sc.next();
			for (int j = 0; j < w; j++) {
				char c = k.charAt(j);
				if (c == 'I') {
					floor[i][j] = false;
				} else {
					floor[i][j] = true;
				}
			}
		}

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < w; j++) {
				first = true;
				recurse(i, j);
				if (firstprime) {
					// System.out.println(size);
					list.add(size);
					firstprime = false;
				}

			}
		}

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1; j++) {
				if (list.get(j) > list.get(j + 1)) {
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		int u = 0;
		for (int i = list.size() - 1; i >= 0; i--) {
			if (f >= list.get(i)) {
				f -= list.get(i);
				u++;
			} else {
				break;
			}
		}
		String r;
		if (u == 1)
			r = " room, ";
		else
			r = " rooms, ";

		System.out.println(u + r + f + " square metre(s) left over");

		sc.close();
	}

}
