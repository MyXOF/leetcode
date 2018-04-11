package cn.edu.myxof.solution5;

public class Solution55 {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }
        int len = nums.length;
        int lastPos = len-1;
        for(int i = len-1;i >= 0;i--){
            if(nums[i]+i>=lastPos){
                lastPos = i;
            }
        }
        return lastPos == 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1,1,0,1};
	}

}
