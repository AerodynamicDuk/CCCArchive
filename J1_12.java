import java.util.*;

public class J1_12 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);		
		int limit = sc.nextInt();
		int current = sc.nextInt();		
				
		if (current-limit<20 && current-limit>1) {				
			System.out.println("You are speeding and your fine is $100.");
		}
			
		if (current-limit<30 && current-limit>21) {			
			System.out.println("You are speeding and your fine is $270.");
		}
			
		if (current-limit>31) {			
			System.out.println("You are speeding and your fine is $500.");
		}
					
		if (current<=limit) {
			System.out.println("Congratulations, you are within the speed limit!");
		}
		sc.close();	
	}

}