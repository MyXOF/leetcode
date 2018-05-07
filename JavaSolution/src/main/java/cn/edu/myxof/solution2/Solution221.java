package cn.edu.myxof.solution2;

public class Solution221 {
    public int maximalSquare(char[][] matrix) {
    	if(matrix == null || matrix.length == 0) return 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int maxLen = 0;
        int[] dp = new int[col+1];
        int pre = 0;
        for(int i = 1;i <= row;i++){
        	for(int j = 1; j <= col;j++){
        		int tmp = dp[j];
        		if(matrix[i-1][j-1] == '1'){
        			dp[j] = Math.min(Math.min(dp[j-1], pre), dp[j])+1;
        			maxLen = Math.max(maxLen, dp[j]);
        		} else{
        			dp[j] = 0;
        		}
        		pre = tmp;
        	}
        }
        return maxLen * maxLen;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
