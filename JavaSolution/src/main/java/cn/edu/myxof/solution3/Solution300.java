package cn.edu.myxof.solution3;

import java.util.Arrays;

public class Solution300 {
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int len = 0;
        int[] dp = new int[nums.length];
        for(int num : nums){
            int index = Arrays.binarySearch(dp,0,len,num);
            if(index < 0){
                index = -(index+1);
            }
            dp[index] = num;
            if(index == len){
                len++;
            }
            
        }
        return len;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
