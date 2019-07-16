import java.util.*;

public class J2_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int reading1 = sc.nextInt();
		int reading2 = sc.nextInt();
		int reading3 = sc.nextInt();
		int reading4 = sc.nextInt();	
		if (reading1<reading2 && reading2<reading3 && reading3<reading4) {			
			System.out.println("Fish Rising");
		}			
		else if (reading1>reading2 && reading2>reading3 && reading3>reading4) {			
			System.out.println("Fish Diving");			
		}
		
		else if (reading1 == reading2 && reading2 == reading3 && reading3 == reading4 && reading4 == reading1) {			
			System.out.println("Fish At Constant Depth");			
		}			
		else {				
			System.out.println("No Fish");
		}

	}		
}
