import java.util.*;

public class J3_11 {

	public static void recurse(int a, int b, int cnt) {
		if (a < b) {
			System.out.println(cnt);
			return;
		}
		recurse(b, a - b, cnt + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		recurse(a,b,2);
	}

}
