package cn.edu.myxof.solution7;

public class Solution754 {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int n = 0;
        while(target > 0){
        	n++;
        	target -= n;
        }
        return target % 2 == 0 ? n : n + 1 + n %2;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
