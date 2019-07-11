import java.util.*;

public class S3_13 {
	static int teamnum;
	static int[] score = new int[5];
	static int num;
	static int[][] teams = { { 1, 2 }, { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 3, 4 } };
	static boolean[][] played = new boolean[5][5];
	static int cnt = 0;

	public static boolean checkWin() {
		int max = score[teamnum];

		for (int i = 1; i < 5; i++) {
			if (score[i] >= max && i != teamnum) {
				return false;
			}
		}

		return true;
	}

	public static void dfs(int row) {
		if (row > 5) {
			// find if team win or not
			if (checkWin())
				cnt++;
			return;
		}
		int i = teams[row][0];
		int j = teams[row][1];

		if (played[i][j]) {
			dfs(row + 1);
			return;
		}

		score[j] += 3;
		dfs(row + 1);
		score[j] -= 3;
		score[i] += 3;
		dfs(row + 1);
		score[i] -= 2;
		score[j] += 1;
		dfs(row + 1);
		score[i] -= 1;
		score[j] -= 1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		teamnum = sc.nextInt();
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sa = sc.nextInt();
			int sb = sc.nextInt();
			played[a][b] = true;
			played[b][a] = true;

			if (sa > sb) {
				score[a] += 3;
			} else if (sa < sb) {
				score[b] += 3;
			} else {
				score[a] += 1;
				score[b] += 1;
			}

		}

		dfs(0);
		System.out.println(cnt);
		sc.close();
	}

}
