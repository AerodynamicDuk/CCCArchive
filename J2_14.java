import java.io.*;
import java.util.*;

public class J2_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int length = sc.nextInt();
		String word = sc.next();
		int c=0;		
		for (int i = 0; i < length; i++) {			
			if (word.charAt(i) == 'A') 
				c++;
			else 
				c--;
		}
		
		if (c > 0) {
			System.out.println('A');
			return;
		}
		
		if (c == 0) {
			System.out.println("Tie");
			return;
		}
		
		if (c < 0) {
			System.out.println('B');
		}	

	}

}