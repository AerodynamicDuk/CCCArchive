import java.util.*;

public class S1_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;
		for (int i = a; i <= b; i++) {			
			double squareTest = Math.sqrt(i);
			int sqr = (int) Math.floor(squareTest);			
			if (squareTest == sqr) {				
				double cubeTest = Math.cbrt(i);
				int cube = (int) Math.floor(cubeTest);				
				if (cubeTest == cube) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);		
		sc.close();
	}

}