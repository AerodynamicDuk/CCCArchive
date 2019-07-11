import java.util.*;

public class S2_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		Yodeller[] list = new Yodeller[n];
		Yodeller[] rank = new Yodeller[n];
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < n; j++) {

				if (i == 0) {
					list[j] = new Yodeller();
					rank[j] = list[j];
				}

				list[j].update(sc.nextInt());

			}

			for (int p = (list.length - 1); p >= 0; p--) {

				for (int q = 1; q <= p; q++) {

					if (rank[q - 1].getscore() < rank[q].getscore()) {
						Yodeller temp = new Yodeller();
						temp = rank[q - 1];
						rank[q - 1] = rank[q];
						rank[q] = temp;
					}
				}
			}

			for (int o = 0; o < list.length; o++) {
				if (o < list.length - 1) {
					if (rank[o].getscore() == rank[o + 1].getscore()) {

						rank[o].setrank(o);
						rank[o + 1].setrank(o);
						o++;
						continue;
					}
				}

				rank[o].setrank(o);
			}

		}

		for (int i = 0; i < n; i++) {
			if (list[i].getrank() == 1) {
				System.out.println("Yodeller " + (i + 1) + " is the TopYodeller: score " + list[i].getscore()
						+ ", worst rank " + list[i].getworst());
				break;
			}
		}
		
		sc.close();

	}
}
