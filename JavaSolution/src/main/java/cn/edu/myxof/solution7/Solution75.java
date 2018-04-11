package cn.edu.myxof.solution7;

public class Solution75 {
    public void sortColors(int[] nums) {
        int index0 = -1, index1 = -1, index2 = -1;
        for(int n : nums){
            if(n == 0){
                index0++;
                index2++;
                swap(nums, index0, index2);
                index1++;
                if(nums[index2] == 1){                   
                    swap(nums, index1, index2);
                }
            } else if(n == 1){
                index1++;
                index2++;
                swap(nums, index1, index2);
            } else{
                index2++;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j){
        if(i == j) return;
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution75 solution = new Solution75();
		int[] nums = {0,1};
		solution.sortColors(nums);
		System.out.println(nums[0]);
	}

}
