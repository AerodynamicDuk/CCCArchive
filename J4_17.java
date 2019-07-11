import java.util.*;

public class J4_17 {

	public static String time = "1200";

	public static void update() {
		int i = Integer.parseInt(time);
		i++;
		if (i % 100 == 60) {
			i += 40;
		}
		if (i / 100 == 13) {
			i = 100;
		}
		time = i + "";
	}

	public static boolean check() {
		int a = Integer.parseInt(time.charAt(0) + "");
		int b = Integer.parseInt(time.charAt(1) + "");
		int c = Integer.parseInt(time.charAt(2) + "");
		int d = -1;
		try {
			d = Integer.parseInt(time.charAt(3) + "");
		} catch (Exception e) {
		}

		if (b - a == c - b) {
			if (d != -1) {
				if (d - c == c - b)
					return true;
				else
					return false;
			}
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = n % 3600;

		int cnt = 0;
		for (int i = 0; i < k; i++) {
			update();
			if (check()) {
				cnt++;
				//System.out.println(time);
			}
		}		
		System.out.println(cnt + 155*(n/3600));
	}

}
