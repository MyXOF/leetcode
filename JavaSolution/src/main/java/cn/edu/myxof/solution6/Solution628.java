package cn.edu.myxof.solution6;

public class Solution628 {
    public int maximumProduct(int[] nums) {
        if(nums == null) return 0;
        int len = nums.length;
        if(len < 3) return 0;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        
        for(int n: nums){
            if(n <= min1){
                min2 = min1;
                min1 = n;
            } else if(n <= min2){
                min2 = n;
            }
            
            if(n >= max3){
                max1 = max2;
                max2 = max3;
                max3 = n;
            } else if(n>= max2){
                max1 = max2;
                max2 = n;
            } else if(n>= max1){
                max1 = n;
            }
        }
        
        return Math.max(max1*max2*max3, max3*min1*min2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
