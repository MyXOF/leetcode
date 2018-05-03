package cn.edu.myxof.solution4;

public class Solution474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(String s: strs){
        	int n0 = 0, n1 = 0;
        	for(Character character : s.toCharArray()){
        		if(character == '0'){
        			n0++;
        		} else{
        			n1++;
        		}
        	}
        	for(int i = m; i >= n0; i--){
        		for(int j = n;j >= n1;j--){
        			dp[i][j] = Math.max(dp[i][j], dp[i-n0][j-n1]+1);
        		}
        	}   	
        }
        return dp[m][n];
    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
