import java.util.*;

public class S2_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();
		int n = sc.nextInt();

		int nx = 0;
		int ny = 0;
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (x == 0 && y == 0) {
				break;
			}

			nx = nx + x;
			ny = ny + y;

			if (ny > n) {
				ny = n;
			}
			if (nx > c) {
				nx = c;
			}
			if (nx < 0) {
				nx = 0;
			}
			if (ny < 0) {
				ny = 0;
			}

			System.out.println(nx + " " + ny);

		}
		
		sc.close();
	}

}
