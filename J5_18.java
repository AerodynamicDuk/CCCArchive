import java.util.*;

public class J5_18 {

	static Map<Integer, LinkedList<Integer>> graph = new HashMap<>();
	static int n; // number of nodes
	static int m; // number of edges
	static int[] indeg;
	static int cnt = 0;
	static int l;
	static boolean ch = true;

	public static void bfs(int s) {
		Queue<Integer> qu = new LinkedList<>(); // maintain adjacent nodes
		boolean[] visited = new boolean[n + 1];

		qu.add(s);
		visited[s] = true; // boolean array of visited
		int level = 0;

		while (!qu.isEmpty()) {
			int size = qu.size();
			level++;
			for (int k = 0; k < size; k++) {
				int current = qu.poll();
				cnt++;
				//System.out.print(current + " ");
				LinkedList<Integer> temp = graph.get(current); // adjacency list
				if (temp == null) {
					if (ch) {
					l = level;
					ch = false;
					}
					continue;
				}

				for (int v : temp) {
					if (!visited[v]) {
						visited[v] = true; // mark as visited
						qu.add(v);
					}

				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		indeg = new int[n + 1];
		Arrays.fill(indeg, 0);
		for (int i = 1; i <= n; i++) {
			m = sc.nextInt();
			if (m == 0) {
				continue;
			}
			LinkedList<Integer> temp = new LinkedList<>();
			for (int j = 0; j < m; j++) {
				int num = sc.nextInt();
				indeg[num]++;
				temp.add(num);
			}
			graph.put(i, temp);
		}

		for (int k = 2; k <= n; k++) {
			if (indeg[k] == 0) {
				System.out.println("N");
				bfs(1);
				System.out.println(l);
				return;
			}
		}
		
		bfs(1);
		if (cnt < n) {
		System.out.println('N');
		} else {
			System.out.println('Y');
		}
		System.out.println(l);
		sc.close();
	}

}
