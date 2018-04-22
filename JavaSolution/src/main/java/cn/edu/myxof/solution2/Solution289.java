package cn.edu.myxof.solution2;

public class Solution289 {
	public void gameOfLife(int[][] board) {
		int row = board.length;
		int col = board[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int count = 0;
				for (int r = Math.max(0, i - 1); r < Math.min(row, i + 2); r++) {
					for (int c = Math.max(0, j - 1); c < Math.min(col, j + 2); c++) {
						if (r == i && c == j)
							continue;
						count += board[r][c] & 1;
					}
				}
				if (count == 3 || (count == 2 && board[i][j] == 1)) {
					board[i][j] |= 2;
				}

			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				board[i][j] >>= 1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][] board = new int[2][2];
		// board[0] = new int[2];
		// board[0][0] = 1;
		// board[0][1] = 1;
		// board[1] = new int[2];
		// board[1][0] = 1;
		// board[1][1] = 0;
	}

}
