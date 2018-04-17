package cn.edu.myxof.solution5;

public class Solution53 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int all = nums[len-1];
        int start = nums[len-1];
        for(int i = len -2;i >= 0;i--){
            start = Math.max(nums[i], nums[i]+start);
            all = Math.max(start, all);            
        }
        return all;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
