import java.io.*;
import java.util.*;

public class S1_19 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k = sc.next();

		int h = 0;
		int v = 0;

		int[][] arr = new int[2][2];
		arr[0][0] = 1;
		arr[1][0] = 2;
		arr[0][1] = 3;
		arr[1][1] = 4;

		for (int i = 0; i < k.length(); i++) {
			if (k.charAt(i) == 'H')
				h++;
			else
				v++;
		}

		if (h % 2 == 1) {
			int e = arr[0][0];
			arr[0][0] = arr[0][1];
			arr[0][1] = e;			
			e = arr[1][0];
			arr[1][0] = arr[1][1];
			arr[1][1] = e;
		}
		
		if (v % 2 == 1) {
			int e = arr[0][0];
			arr[0][0] = arr[1][0];
			arr[1][0] = e;			
			e = arr[0][1];
			arr[0][1] = arr[1][1];
			arr[1][1] = e;
		}
		
		System.out.println(arr[0][0] + " " + arr[1][0]);
		System.out.println(arr[0][1] + " " + arr[1][1]);
		sc.close();
	}
}