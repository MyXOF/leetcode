package cn.edu.myxof;

public class Solution357 {
    public int countNumbersWithUniqueDigits(int n) {
        if(n < 0) return 0;
        if(n == 0) return 1;
        int res = 0;
        int tmp = 1;
        for(int i = 1;i < n;i++){
            if(i == 10) break;
            tmp *= (10-i);
            res += tmp;
        }
        return 9*res+10;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
