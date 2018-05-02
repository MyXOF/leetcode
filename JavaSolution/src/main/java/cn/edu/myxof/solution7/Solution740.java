package cn.edu.myxof.solution7;

public class Solution740 {
    public int deleteAndEarn(int[] nums) {
        int[] arr = new int[10001];
        for(int n : nums){
        	arr[n] += n;
        }
        int rest = 0, rob = arr[1];
        for(int i = 2; i <= 10000;i++){
        	int tmp = rest;
        	rest = Math.max(rest, rob);
        	rob = Math.max(rob, tmp+arr[i]);
        }
        return Math.max(rest, rob);  
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = {3,4,2};
	}

}
