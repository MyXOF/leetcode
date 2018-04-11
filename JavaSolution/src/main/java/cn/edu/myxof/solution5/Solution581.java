package cn.edu.myxof.solution5;

public class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int len = nums.length;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        boolean flag = false;
        for(int i = 0; i < len - 1;i++){
            if(nums[i]>nums[i+1]){
                flag = true;
            }
            if(flag){
                minValue = Math.min(minValue,nums[i+1]);
            }
        }
        flag = false;
        for(int i = len-1;i > 0;i--){
            if(nums[i-1] > nums[i]){
                flag = true;
            }
            if(flag){
                maxValue = Math.max(maxValue,nums[i-1]);
            }
        }
        int l,r;
        for(l = 0; l < len;l++){
            if(nums[l] > minValue){
                break;
            }
        }
        for(r = len-1;r >= 0;r--){
            if(nums[r] < maxValue){
                break;
            }
        }
        return r-l+1<0 ? 0 : r-l+1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution581 s = new Solution581();
		int[] arr = {2,1};
		System.out.println(s.findUnsortedSubarray(arr));
	}

}
