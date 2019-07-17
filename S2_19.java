import java.io.*;
import java.util.*;

public class S2_19 {
    public static void primes(int a) {
		for (int i = 2, j = a - 2; i < a / 2; i++, j--) {
			if (checkPrime(i) && checkPrime(j)) {
				System.out.println(i + " " + j);
				return;
			}
		}
	}

	public static boolean checkPrime(int a) {
		int sq = (int) Math.sqrt(a);
		for (int i = 2; i <= sq; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());	
		for (int i = 0; i < k; i++) {
			int x = Integer.parseInt(br.readLine()) * 2;
			primes(x);
		}
	}
}