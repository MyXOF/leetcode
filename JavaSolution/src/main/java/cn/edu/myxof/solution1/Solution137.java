package cn.edu.myxof.solution1;

public class Solution137 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i < 32;i++){
            int sum = 0;
            for(int n : nums){
                if((n & (1 << i)) != 0) sum++;
            }
            if(sum % 3 != 0) res |= 1 << i;
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
