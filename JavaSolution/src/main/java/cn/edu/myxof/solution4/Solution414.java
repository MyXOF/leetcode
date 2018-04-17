package cn.edu.myxof.solution4;

public class Solution414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,5,3,5};
        int max1 = Integer.MIN_VALUE + 2;
        int max2 = max1 - 1;
        int max3 = max2 - 1;
        boolean flag = false;
        for(int n: nums){
            if(n > max1){
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if(n == max1){
                
            } else if(max2 < n){
                max3 = max2;
                max2 = n;
            } else if(max2 == n){
                
            } else if(max3 < n){
                max3 = n;
                flag = true;
            }
        }
        System.out.println( flag ? max3 : max1);
	}

}
