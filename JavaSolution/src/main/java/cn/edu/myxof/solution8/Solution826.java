package cn.edu.myxof.solution8;

public class Solution826 {
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
    	int maxLevel = 0;
    	for(int w: worker){
    		if(w > maxLevel) maxLevel = w;
    	}
    	int[] dp = new int[maxLevel+1];
    	
    	int len = difficulty.length;
    	for(int i = 0; i < len;i++){
    		if(difficulty[i] <= maxLevel){
    			dp[difficulty[i]] = Math.max(profit[i], dp[difficulty[i]]);
    		}
    	}
    	for(int i = 1; i <= maxLevel;i++){
    		dp[i] = Math.max(dp[i], dp[i-1]);
    	}
    	int sum = 0;
    	for(int w: worker){
    		sum += dp[w];
    	}
    	return sum;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(maxProfitAssignment(new int[]{2,4,6,8,10}, new int[]{10,20,30,40,50}, new int[]{4,5,6,7}));
		System.out.println(maxProfitAssignment(new int[]{13,37,58}, new int[]{4,90,96}, new int[]{34,73,45}));
	}

}
