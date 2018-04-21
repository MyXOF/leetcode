package cn.edu.myxof.solution3;

public class Solution342 {
    public boolean isPowerOfFour(int num) {
        return (num > 0) && ((num & (num-1)) == 0) && ((num & 0x55555555) != 0);
        // return (Math.log(num) / Math.log(4)) % 1 == 0;
        // return Integer.bitCount(num) == 1 && (Integer.toBinaryString(num).length()-1)%2==0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
