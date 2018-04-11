package cn.edu.myxof.solution5;

import java.util.Arrays;
import java.util.List;

public class Solution539 {
    public int findMinDifference(List<String> timePoints) {
        if(timePoints == null || timePoints.size() == 0 || timePoints.size() == 1){
            return -1;
        }
        int len = timePoints.size();
        int[] dp = new int[len];
        for(int i = 0;i < len;i++){
            dp[i] = transform(timePoints.get(i));
        }
        Arrays.sort(dp);
        int range = 60*24;
        int minDiff = Integer.MAX_VALUE;
        for(int i = 1;i < len;i++){
            int v = dp[i] - dp[i-1];
            v = Math.min(range-v,v);
            minDiff = Math.min(v,minDiff);
        }
        int v = dp[len-1]-dp[0];
        v = Math.min(range-v,v);
        minDiff = Math.min(v,minDiff);
        return minDiff;
    }
    
    private int transform(String str){
        String[] values = str.split(":");
        return 60*(Integer.parseInt(values[0]))+Integer.parseInt(values[1]);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
