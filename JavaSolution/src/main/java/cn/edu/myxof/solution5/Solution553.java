package cn.edu.myxof.solution5;

public class Solution553 {
	public String optimalDivision(int[] nums) {
		if (nums == null)
			return "";
		int len = nums.length;
		if (len == 1)
			return nums[0] + "";
		if (len == 2)
			return nums[0] + "/" + nums[1];
		StringBuilder builder = new StringBuilder();
		builder.append(nums[0]).append("/(").append(nums[1]);
		for (int i = 2; i < len; i++) {
			builder.append("/").append(nums[i]);
		}
		builder.append(")");
		return builder.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
