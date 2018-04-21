package cn.edu.myxof.solution1;

public class Solution153 {
    public int findMin(int[] nums) {
        if(nums == null){
            return -1;
        }
        return func(nums, 0, nums.length-1);
    }
    
    private int func(int[] nums, int start, int end){
        int mid = start + (end - start) / 2;
        if(mid == start){
            return Math.min(nums[start], nums[end]);
        }
        if(nums[mid] > nums[end]){
            return func(nums, mid, end);
        } else if(nums[mid] < nums[start]){
            return func(nums, start, mid);
        } else{
            return nums[start];
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
