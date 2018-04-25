package cn.edu.myxof.solution5;


public class Solution59 {
	public int[][] generateMatrix(int n) {
		if (n <= 0)
			return null;
		int[][] res = new int[n][n];

		int num = 1;
		int r1 = 0, c1 = 0, r2 = n - 1, c2 = n - 1;
		while (r1 < r2 && c1 < c2) {
			num = func(res, r1, r2, c1, c2, num);
			r1++;
			r2--;
			c1++;
			c2--;
		}
		if (r1 == r2) {
			for (int i = c1; i <= c2; i++) {
				res[r1][i] = num++;
			}
		} else if (c1 == c2) {
			for (int i = r1; i <= r2; i++) {
				res[i][c2] = num++;
			}
		}
		return res;
	}
	
	private int func(int[][] matrix, int r1, int r2, int c1, int c2, int num) {
		for (int i = c1; i < c2; i++) {
			matrix[r1][i] = num++;
		}
		for (int i = r1; i < r2; i++) {
			matrix[i][c2]= num++;
		}
		for (int i = c2; i > c1; i--) {
			matrix[r2][i]= num++;
		}
		for (int i = r2; i > r1; i--) {
			matrix[i][c1]= num++;
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 3;
//		int[][] res = new int[n][n];
//		System.out.println(res);
	}

}
