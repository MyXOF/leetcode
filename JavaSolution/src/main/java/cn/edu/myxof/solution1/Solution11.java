package cn.edu.myxof.solution1;

public class Solution11 {
	public int maxArea(int[] height) {
		int res = 0;
		if (height == null || height.length < 2) {
			return res;
		}
		int len = height.length;
		int l = 0;
		int r = len - 1;
		while (l < r) {
			res = Math.max(res, Math.min(height[l], height[r]) * (r - l));
			if (height[l] < height[r]) {
				l++;
			} else {
				r--;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] height = {1,2,3,4};

	}

}
