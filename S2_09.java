import java.util.*;
public class S2_09 {
	
	static int r;
	static int l;
	static boolean[][] arr;
	static Set<String> set = new HashSet<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		r = sc.nextInt();
		l = sc.nextInt();		
		arr = new boolean[r][l];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < l; j++) {
				int t = sc.nextInt();
				if (t == 1) {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		
		boolean[] temp = new boolean[l];
		
		for (int i = r; i > 0; i--) {
			int j = i;
			for (int k = 0; k < l;k++) {
				temp[k] = arr[j-1][k]; //array above
			}
			
			while(j < r) {
				for (int m = 0; m < l; m++) {
					if (arr[j][m] == temp[m]) {
						temp[m] = false;
					} else {
						temp[m] = true;
					} //rolling conversion down
				}
				j++;
			}
			
			String re = "";
			for (int k = 0; k < l; k++) {
				re += temp[k];
			}
			set.add(re);
		}
		System.out.println(set.size());		
		
	}

}
