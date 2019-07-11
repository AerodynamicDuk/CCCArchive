import java.util.*;
public class S2_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		LinkedList<Integer> train = new LinkedList<>();
		LinkedList<Integer> bridge = new LinkedList<>();
		
		for (int i = 0; i < k;i++) {
			train.addLast(sc.nextInt());
		}
		
		int w = 0;
		int temp = 0;
		for (int i = 0; i < 4 && i < k;i++) {
			temp = train.removeFirst();
			bridge.addFirst(temp);
			w += temp;
			if (w > n) {
				System.out.println(i);
				return;
			}
		}	
		
		
		
		for (int i = 4; i < k;i++) {
			temp = bridge.removeLast();
			w -= temp;
			temp = train.removeFirst();
			bridge.addFirst(temp);
			w += temp;
			if (w > n) {
				System.out.println(i);
				return;
			}
		}
		
		System.out.println(k);
		
	}

}
