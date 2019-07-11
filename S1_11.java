import java.util.*;

public class S1_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		String k = "";

		int s = 0;
		int t = 0;
		for (int i = 0; i < n; i++) {
			k = sc.nextLine();
			k = k.toLowerCase();
			for (int j = 0; j < k.length(); j++) {
				if (k.charAt(j) == 's') {
					s++;
				} else if (k.charAt(j) == 't') {
					t++;
				}
			}
		}
		
		if (t > s) {
			System.out.println("English");
			return;
		}

		System.out.println("French");

	}

}
