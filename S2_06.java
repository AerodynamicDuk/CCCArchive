import java.util.*;
public class S2_06 {
	
	static Map<Character, Character> map = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		String plain = sc.nextLine();
		String cipher = sc.nextLine();
		String dec = sc.nextLine();

		for (int i = 0; i < plain.length(); i++) {
			char c = plain.charAt(i);
			char t = cipher.charAt(i);
			if (map.get(t) == null){
				map.put(t,c);
				continue;
				
			}
			if (map.get(t) != c) {
				map.put(t, '.');
			}
		}
		
		for (int i = 0; i < dec.length(); i++) {
			char e = dec.charAt(i);
			if (map.get(e) == null) {
				System.out.print('.');
				continue;
			}
			System.out.print(map.get(e));
		}
	}

}
