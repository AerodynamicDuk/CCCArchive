import java.util.*;

public class J4_11 {
	static Map<String, Boolean> well = new HashMap<>();
	static int x;
	static int y;

	public static void travel(char c, int p) {
		boolean danger = false;
		switch (c) {
		case 'l':
			int nx = 0;
			for (int i = 1; i <= p; i++) {
				nx = x - i;
				if (well.get(nx + "/" + y) != null) {
					danger = true;
				} else {
					well.put(nx + "/" + y, true);
				}
			}
			x = nx;
			break;
		case 'r':
			int mx = 0;
			for (int i = 1; i <= p; i++) {
				mx = x + i;
				if (well.get(mx + "/" + y) != null) {
					danger = true;
				}else {
					well.put(mx + "/" + y, true);
				}
			}
			x = mx;
			break;
		case 'u':
			int ny = 0;
			for (int i = 1; i <= p; i++) {
				ny = y + i;
				if (well.get(x + "/" + ny) != null) {
					danger = true;
				}else {
					well.put(x + "/" + ny, true);
				}
			}
			y = ny;
			break;
		case 'd':
			int my = 0;
			for (int i = 1; i <= p; i++) {
				my = y - i;
				if (well.get(x + "/" + my) != null) {
					danger = true;
				}else {
					well.put(x + "/" + my, true);
				}
			}
			y = my;
			break;
		}

		System.out.print(x + " " + y);
		if (danger) {
			System.out.print(" " + "DANGER");
			System.exit(0);;
		} else {
			System.out.print(" " + "safe");
			System.out.println();
			return;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		well.put("0/-1", true);
		well.put("0,-2", true);
		well.put("0/-3", true);
		well.put("1/-3", true);
		well.put("2/-3", true);
		well.put("3/-3", true);
		well.put("3/-4", true);
		well.put("3/-5", true);
		well.put("4/-5", true);
		well.put("5/-5", true);
		well.put("5/-4", true);
		well.put("5/-3", true);
		well.put("6/-3", true);

		for (int i = -3; i >= -7; i--) {
			String t = "7/" + i;
			well.put(t, true);
		}
		for (int i = 7; i >= -1; i--) {
			String t = i + "/-7";
			well.put(t, true);
		}
		for (int i = -7; i <= -5; i++) {
			String t = "-1/" + i;
			well.put(t, true);
		}

		x = -1;
		y = -5;

		while (true) {
			char c = sc.next().charAt(0);
			int i = sc.nextInt();

			if (c == 'q') {
				sc.close();
				return;
			}
			travel(c, i);

		}

	}

}
