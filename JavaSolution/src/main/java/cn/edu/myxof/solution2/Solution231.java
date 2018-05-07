package cn.edu.myxof.solution2;

public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && ((n & (n-1)) == 0);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
