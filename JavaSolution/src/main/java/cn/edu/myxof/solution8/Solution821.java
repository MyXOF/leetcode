package cn.edu.myxof.solution8;

public class Solution821 {
    public int[] shortestToChar(String S, char C) {
		int len = S.length();
        int[] res = new int[len];
        int first = S.indexOf(C);        
        for(int i = 0; i < first;i++){
        	res[i] = first - i;
        }
        int next = S.indexOf(C, first+1);
        
        while(next != -1){
        	for(int i = 1; first + i <= next - i;i++){
        		res[first+i] = i;
        		res[next-i] = i;
        	}
        	first = next;
        	next = S.indexOf(C, first+1);
        }
        for(int i = 1; i+first < len;i++){
        	res[first+i] = i;
        }
        return res;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String S = "loveleetcode";
//		char C = 'e';
	}

}
