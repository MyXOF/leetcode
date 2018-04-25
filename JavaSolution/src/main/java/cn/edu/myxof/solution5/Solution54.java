package cn.edu.myxof.solution5;

import java.util.ArrayList;
import java.util.List;

public class Solution54 {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<>();
		if (matrix == null) {
			return res;
		}
		int row = matrix.length;
		if (row == 0)
			return res;
		int col = matrix[0].length;
		if (col == 0)
			return res;
		int r1 = 0, c1 = 0, r2 = row - 1, c2 = col - 1;
		while (r1 < r2 && c1 < c2) {
			func(matrix, res, r1, r2, c1, c2);
			r1++;
			r2--;
			c1++;
			c2--;
		}
		if (r1 == r2) {
			for (int i = c1; i <= c2; i++) {
				res.add(matrix[r1][i]);
			}
		} else if (c1 == c2) {
			for (int i = r1; i <= r2; i++) {
				res.add(matrix[i][c2]);
			}
		}
		return res;
	}

	private void func(int[][] matrix, List<Integer> res, int r1, int r2, int c1, int c2) {
		for (int i = c1; i < c2; i++) {
			res.add(matrix[r1][i]);
		}
		for (int i = r1; i < r2; i++) {
			res.add(matrix[i][c2]);
		}
		for (int i = c2; i > c1; i--) {
			res.add(matrix[r2][i]);
		}
		for (int i = r2; i > r1; i--) {
			res.add(matrix[i][c1]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
