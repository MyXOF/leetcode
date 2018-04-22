package cn.edu.myxof.solution8;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m-1;
        int index2 = n-1;
        int index = m+n-1;
        while(index2 >= 0 && index1 >= 0){
            if(nums1[index1] > nums2[index2]){
                nums1[index] = nums1[index1];
                index1--;
            } else{
                nums1[index] = nums2[index2];
                index2--;
            }
            index--;
        } 
        while(index2 >= 0){
            nums1[index] = nums2[index2];
            index--;
            index2--;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
