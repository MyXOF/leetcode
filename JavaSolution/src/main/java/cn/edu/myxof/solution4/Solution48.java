package cn.edu.myxof.solution4;

public class Solution48 {
	public void rotate(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return;
		}
		int n = matrix.length;
		if (n % 2 == 0) {
			int len = (n - 1) / 2;
			for (int i = 0; i <= len; i++) {
				for (int j = 0; j <= len; j++) {
					rotate4(matrix, i, j, n);
				}
			}
		} else {
			int len = n / 2 - 1;
			for (int i = 0; i <= len; i++) {
				for (int j = 0; j <= len; j++) {
					rotate4(matrix, i, j, n);
				}
				rotate4(matrix, len + 1, i, n);
			}
		}
	}

	private void rotate4(int[][] matrix, int i, int j, int n) {
		int ax = i, ay = j;
		int bx = j, by = n - 1 - i;
		int cx = n - 1 - i, cy = n - 1 - j;
		int dx = n - 1 - j, dy = i;
		swap(matrix, ax, ay, bx, by);
		swap(matrix, ax, ay, dx, dy);
		swap(matrix, cx, cy, dx, dy);
	}

	private void swap(int[][] matrix, int ax, int ay, int bx, int by) {
		int tmp = matrix[ax][ay];
		matrix[ax][ay] = matrix[bx][by];
		matrix[bx][by] = tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
