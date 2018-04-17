package cn.edu.myxof.solution4;

public class Solution476 {
    public int findComplement(int num) {
        if(num < 0) return num ^ 0xffffffff;
        if(num == 0) return -1;
        
        int nozeroNum = 32 - Integer.numberOfLeadingZeros(num);
        int tmp = 0;
        for(int i = 0; i < nozeroNum;i++){
            tmp = (tmp << 1) | 1;
        }
        return num ^ tmp;        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
