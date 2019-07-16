import java.util.*;

public class J2_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int last = sc.nextInt();
		for (int i = first; i <= last; i = i + 60) {
			System.out.println("All positions change in year " + i);
		}
		sc.close();		
	}

}
