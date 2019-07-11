import java.util.*;

public class J5_00 {

	public static boolean complete = false;
	static Map<String, LinkedList<String>> map = new HashMap<>();

	public static ArrayList<Integer> search(String a, String b) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i <= a.length() - b.length(); i++) {
			if (a.substring(i, i + b.length()).equals(b)) {
				arr.add(i);
			}
		}
		return arr;
	}

	public static boolean bfs(String a, String b) {
		Queue<String> q = new LinkedList<>();
		Set<String> set = new HashSet<>();
		q.add(a);
		while (!q.isEmpty()) {
			int size = q.size();

			for (int k = 0; k < size; k++) {
				String current = q.poll();
				LinkedList<String> temp = map.get(current); // adjacency list
				if (temp == null) {
					continue;
				}

				for (String v : temp) {
					if (v.equals(b)) {
						return true;
					}
					if (set.add(v)) {
						q.add(v);
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt(sc.nextLine());
		int cnt = 0;
		String current = "";
		ArrayList<String> u = new ArrayList<>();
		boolean link = true;
		while (true) {
			String s = sc.nextLine();
			if (s.equals("The End"))
				break;
			if (link) {
				if (cnt >= k) {
					u.add(s);
					continue;
				}
				current = s;
				cnt++;
				link = false;
				continue;
			}
			if (s.substring(0, 2).equals("</")) {
				link = true;
				continue;
			}
			ArrayList<Integer> arr = search(s, "A HREF=");
			String url, temp = "";
			for (int e = 0; e < arr.size(); e++) {
				url = s.substring(arr.get(e) + 8);
				temp = "";
				for (int q = 0; q < url.length(); q++) {
					if (url.charAt(q) != '"')
						temp += url.charAt(q);
					else
						break;
				}
				url = temp;
				LinkedList<String> l;
				if (map.get(current) == null) {
					l = new LinkedList<>();
					l.add(url);
					map.put(current, l);
					
				} else {
					map.get(current).add(url);
					map.put(current, map.get(current));
				}
				System.out.println("Link from " + current + " to " + url);
			}

		}

		for (int r = 0; r < u.size(); r += 2) {
			if (bfs(u.get(r), u.get(r + 1))) {
				System.out.println("Can surf from " + u.get(r) + " to " + u.get(r + 1) + ".");
			} else {
				System.out.println("Can't surf from " + u.get(r) + " to " + u.get(r + 1) + ".");
			}
		}
		sc.close();

	}

}
