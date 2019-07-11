import java.util.*;

public class S2_03 {

	public static boolean vowel(char c) {
		switch (c) {
		case 'a':
			return true;
		case 'u':
			return true;
		case 'i':
			return true;
		case 'o':
			return true;
		case 'e':
			return true;
		default:
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[4];
		String[] type = new String[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				String r = sc.nextLine();
				r = r.toLowerCase();
				String[] temp = r.split(" ");
				String s = temp[temp.length - 1];
				boolean b = false;
				for (int k = s.length() - 1; k >= 0; k--) {
					if (vowel(s.charAt(k))) {
						arr[j] = s.substring(k);
						b = true;
						break;
					}
				}
				if (!b) {
					arr[j] = s;
				}
			}

			if (arr[0].equals(arr[1])) {
				if (arr[1].equals(arr[2]) && arr[2].equals(arr[3])) {
					type[i] = "perfect";
					continue;
				}
				if (arr[2].equals(arr[3])) {
					type[i] = "even";
					continue;
				}

			}

			if (arr[0].equals(arr[2]) && arr[1].equals(arr[3])) {

				type[i] = "cross";
				continue;
			}

			if (arr[0].equals(arr[3]) && arr[1].equals(arr[2])) {
				type[i] = "shell";
				continue;
			}

			type[i] = "free";

		}
		
		
		
		for (int i = 0; i < n; i++) {
			System.out.println(type[i]);
		}
		sc.close();
		

	}

}
