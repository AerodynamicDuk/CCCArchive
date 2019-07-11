import java.util.*;

public class S2_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] grid = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = sc.nextInt();
			}
		}

		int[][] box = new int[2][2];
		box[0][0] = grid[0][0];
		box[0][1] = grid[0][n - 1];
		box[1][0] = grid[n - 1][0];
		box[1][1] = grid[n - 1][n - 1];

		int count = 0;

		while (true) {
			if (box[0][0] > box[0][1] || box[0][0] > box[1][0] || box[0][1] > box[1][1]) {
				count++;
				int temp = box[0][0];
				box[0][0] = box[1][0];
				box[1][0] = box[1][1];
				box[1][1] = box[0][1];
				box[0][1] = temp;
			} else {
				break;
			}

		}

		for (int i = 0; i < count;i++) {
			
		}

	}
	
}
