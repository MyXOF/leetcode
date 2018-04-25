package cn.edu.myxof.solution6;

public class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        if(nums == null || nums.length < k) return 0;
        int maxValue = 0;
        for(int i = 0;i < k;i++){
        	nums[i] += maxValue;
        }
        int kValue = maxValue;
        int len = nums.length;
        for(int i = 1;i <= len - k;i++){
        	kValue = kValue + nums[i+k-1] - nums[i-1];
        	maxValue = Math.max(maxValue, kValue);
        }
        return (double) maxValue / k;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int k = 4;
//		int[] nums = {1,12,-5,-6,50,3};

	}

}
