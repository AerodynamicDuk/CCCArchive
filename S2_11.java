import java.util.*;
public class S2_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue <String> q = new LinkedList<>();
		Queue <String> w = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			q.add(sc.next());
		}
		for (int i = 0; i < n; i++) {
			w.add(sc.next());
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (q.poll().equals(w.poll())) {
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
