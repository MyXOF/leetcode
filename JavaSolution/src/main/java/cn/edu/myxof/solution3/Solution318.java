package cn.edu.myxof.solution3;


public class Solution318 {
    public static int maxProduct(String[] words) {
    	if(words == null || words.length == 0) {
    		return 0;
    	}
    	int len = words.length;
    	int[] dp = new int[len];
    	for(int i = 0; i < len;i++) {
    		for(char c : words[i].toCharArray()) {
    			dp[i] |= (1 << (c - 'a'));
    		}
    		System.out.println(Integer.toBinaryString(dp[i]));
    	}
    	int max = 0;
        for(int i = len-1;i >= 1;i--) {
        	for(int j = i-1;j >= 0;j--) {
        		if((dp[i] & dp[j]) == 0) {
        			max =  Math.max(words[i].length() * words[j].length() , max);
        		}
        	}
        }
        return max;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words  = {"a","ab","abc","d","cd","bcd","abcd"};
		System.out.println(maxProduct(words));
	}

}
