import java.util.*;

public class J2_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);		
		String line = sc.nextLine();
		int happy = 0;
		int sad = 0;		
		for (int i = 0; i < line.length() - 3; i++) {
			if (line.substring(i, i + 3).equals(":-)")){
				happy++;
			} else if (line.substring(i, i + 3).equals(":-(")){
				sad++;
			}			
		}
		
		if (happy > sad) {
			System.out.println("happy");
			return;
		}
		
		if (happy < sad) {
			System.out.println("sad");
			return;
		}
		
		if (happy == sad && sad == 0) {
			System.out.println("none");
			return;
		}
		
		if (happy == sad) {
			System.out.println("unsure");
			return;
		}
	}
}
