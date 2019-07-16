import java.io.*;
import java.util.*;

public class J1_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ageS = sc.nextInt();
		int ageM = sc.nextInt();		
		int out = ageM-ageS;		
		System.out.println(ageM+out);
	}
}
