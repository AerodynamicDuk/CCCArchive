import java.util.*;

public class S3_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			int len = sc.nextInt();
			Stack<Integer> top = new Stack<Integer>();
			Stack<Integer> side = new Stack<Integer>();

			for (int j = 0; j < len; j++) {
				int temp = sc.nextInt();
				top.push(temp);
			}

			int cnt = 1;
			while (true) {

				if (cnt > len && top.empty() && side.empty()) {
					System.out.println('Y');
					break;
				}

				if (!top.empty()) {
					if (top.peek().equals(new Integer(cnt))) {
						top.pop();
						cnt++;
						continue;
					}
				}

				if (!side.empty()) {

					if (side.peek().equals(new Integer(cnt))) {
						side.pop();
						cnt++;
						continue;
					}

					if ((int) top.peek() > (int) side.peek()) {
						System.out.println('N');
						break;
					}

				}
				side.push(top.pop());

			}

		}

	}

}
