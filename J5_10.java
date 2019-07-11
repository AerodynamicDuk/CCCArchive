import java.util.*;

public class J5_10 {
	public static Map<String, LinkedList<String>> graph = new HashMap<>();
	static int endx;
	static int endy;
	public static void bfs(String s) {
		Queue<String> qu = new LinkedList<>(); // maintain adjacent Nodes
		Map<String, Boolean> visited = new HashMap<>();

		qu.add(s);
		visited.put(s, true); // boolean array of visited
		int level = 0;

		while (!qu.isEmpty()) {
			int size = qu.size();
			level++;
			for (int k = 0; k < size; k++) {
				String current = qu.poll();
				LinkedList<String> temp = graph.get(current); // adjacency list
				if (temp == null) {
					continue;
				}

				for (String v : temp) {
					if (v.equals(endx + "-" + endy)) {
						System.out.println(level);
						return;
					}
					if (visited.get(v) == null || !visited.get(v)) {
						visited.put(v, true); // mark as visited
						qu.add(v);
					}
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		endx = sc.nextInt();
		endy = sc.nextInt();
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				String id = i + "-" + j;
				LinkedList<String> temp = new LinkedList<>();
				temp.add(id);
				if (j + 2 <= 8) {
					if (i + 1 <= 8) {
						temp.add((i + 1) + "-" + (j + 2));
					}
					if (i - 1 >= 1) {
						temp.add((i - 1) + "-" + (j + 2));
					}
				}
				if (j - 2 >= 1) {
					if (i + 1 <= 8) {
						temp.add((i + 1) + "-" + (j - 2));
					}
					if (i - 1 >= 1) {
						temp.add((i - 1) + "-" + (j - 2));
					}
				}
				if (i + 2 <= 8) {
					if (j + 1 <= 8) {
						temp.add((i + 2) + "-" + (j + 1));
					}
					if (j - 1 >= 1) {
						temp.add((i + 2) + "-" + (j - 1));
					}
				}
				if (i - 2 >= 1) {
					if (j + 1 <= 8) {
						temp.add((i - 2) + "-" + (j + 1));
					}
					if (j - 1 >= 1) {
						temp.add((i - 2) + "-" + (j - 1));
					}
				}
				
				graph.put(id, temp);

			}
		}
		
		bfs(x + "-" + y);
		sc.close();
	}

}
