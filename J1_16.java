import java.io.*;
import java.util.*;

public class J1_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int winCounter = 0;
		int loopCount = 6;
		while (loopCount > 0) {
			String input = sc.next();
			if (input.equals("W")) {
				winCounter++;
			}
			loopCount--;
		}
		if (winCounter == 0) {
			System.out.println(-1);
		} else if (winCounter == 1 || winCounter == 2) {
			System.out.println(3);
		} else if (winCounter == 3 || winCounter == 4) {
			System.out.println(2);
		} else if (winCounter == 5 || winCounter == 6) {
			System.out.println(1);
		}
	}

}