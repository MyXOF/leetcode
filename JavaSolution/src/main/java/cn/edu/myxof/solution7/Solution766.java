package cn.edu.myxof.solution7;

public class Solution766 {
	public boolean isToeplitzMatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0)
			return false;
		int row = matrix.length;
		int col = matrix[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i > 0 && j > 0 && matrix[i - 1][j - 1] != matrix[i][j])
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
