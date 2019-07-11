import java.util.*;

public class S1_01 {

	public static int swap(char c) {
		switch (c) {
		case 'A':
			return 4;
		case 'K':
			return 3;
		case 'Q':
			return 2;
		case 'J':
			return 1;
		default:
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k = sc.next();
		System.out.println("Cards Dealt              Points");

		LinkedList<Character> clubs = new LinkedList<>();
		LinkedList<Character> diamond = new LinkedList<>();
		LinkedList<Character> hearts = new LinkedList<>();
		LinkedList<Character> spade = new LinkedList<>();

		char c = 'C';
		for (int i = 0; i < 17; i++) {
			
			if (k.charAt(i) == 'C') {
				continue;
			}

			if (k.charAt(i) == 'D') {
				c = 'D';
				continue;
			}
			if (k.charAt(i) == 'H') {
				c = 'H';
				continue;
			}
			if (k.charAt(i) == 'S') {
				c = 'S';
				continue;
			}

			switch (c) {
			case 'C':
				clubs.add(k.charAt(i));
				continue;
			case 'D':
				diamond.add(k.charAt(i));
				continue;
			case 'H':
				hearts.add(k.charAt(i));
				continue;
			case 'S':
				spade.add(k.charAt(i));
				continue;
			}
		}
		int master = 0;
		int cnt = 0;
		System.out.println();
		System.out.print("Clubs ");
		
		if (clubs.size() <= 2) {
			cnt += (3-clubs.size());
		}
		for (int i = 0; i < clubs.size(); i++) {
			System.out.print(clubs.get(i) + " ");
			cnt += swap(clubs.get(i));
		}		
		System.out.print(cnt);
		master += cnt;
		
		cnt = 0;
		System.out.println();
		System.out.print("Diamonds ");
		
		if (diamond.size() <= 2) {
			cnt += (3-diamond.size());
		}
		for (int i = 0; i < diamond.size(); i++) {
			System.out.print(diamond.get(i) + " ");
			cnt += swap(diamond.get(i));
		}		
		System.out.print(cnt);
		master += cnt;
		cnt = 0;
		System.out.println();
		System.out.print("Hearts ");
		
		if (hearts.size() <= 2) {
			cnt += (3-hearts.size());
		}
		for (int i = 0; i < hearts.size(); i++) {
			System.out.print(hearts.get(i) + " ");
			cnt += swap(hearts.get(i));
		}		
		System.out.print(cnt);
		master += cnt;
		
		cnt = 0;
		System.out.println();
		System.out.print("Spades ");
		
		if (spade.size() <= 2) {
			cnt += (3-spade.size());
		}
		for (int i = 0; i < spade.size(); i++) {
			System.out.print(spade.get(i) + " ");
			cnt += swap(spade.get(i));
		}		
		System.out.print(cnt);
		master += cnt;
		
		System.out.println();
		System.out.print("                       Total " + master);
		sc.close();
	}

}
