package cn.edu.myxof.solution7;

public class Solution789 {
	public boolean escapeGhosts(int[][] ghosts, int[] target) {
		int run = Math.abs(target[0]) + Math.abs(target[1]);
		for (int[] g : ghosts) {
			if (Math.abs(g[0] - target[0]) + Math.abs(g[1] - target[1]) <= run)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
