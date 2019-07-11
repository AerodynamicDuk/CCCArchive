import java.util.*;

public class S2_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		HashMap<String, Character> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			char p = sc.next().charAt(0);
			String q = sc.next();

			map.put(q, p);
		}

		Set<String> s = map.keySet();		
		String w = sc.next();
		String a = "";
		for (int i = 0; i < w.length(); i++) {
			a = a + w.charAt(i);
			if (s.contains(a)) {
				System.out.print(map.get(a));
				a = "";
			}
			
		}
		
		sc.close();		
	}

}
