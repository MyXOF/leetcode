package cn.edu.myxof.solution3;

public class Solution343 {
    public int integerBreak(int n) {
        if(n <= 0) return 0;
        if(n == 1 || n == 2) return 1;
        if(n == 3) return 2;
        if(n == 4) return 4;
        int res = 1;
        while(n > 4){
            res *= 3;
            n -= 3;
        }
        return n > 0 ? res * n : res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
