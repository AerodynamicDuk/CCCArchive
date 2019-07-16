import java.io.*;
import java.util.*;

public class J1_09 {
    public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int cut = 9 * 1 + 7 * 3 + 8 * 1 + 0 * 3 + 9 * 1 + 2 * 3 + 1 * 1 + 4 * 3 + 1 * 1 + 8 * 3;

		int first = sc.nextInt();
		int second = sc.nextInt();
		int last = sc.nextInt();

		second = second * 3;
		int out = first + second + last;
		int ready = cut + out;
		System.out.println("The 1-3-sum is " + ready);

	}
}