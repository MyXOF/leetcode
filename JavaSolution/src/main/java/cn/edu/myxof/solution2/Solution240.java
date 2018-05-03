package cn.edu.myxof.solution2;

public class Solution240 {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return false;
		int m = matrix.length, n = matrix[0].length;
		int r = m - 1, c = 0;
		while (r >= 0 && c < n) {
			if (matrix[r][c] == target)
				return true;
			if (target > matrix[r][c]) {
				c++;
			} else {
				r--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
