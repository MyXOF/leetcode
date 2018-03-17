package cn.edu.myxof;

public class Solution796 {
	public boolean rotateString(String A, String B) {
        if(A.length() != B.length()){
            return false;
        }
        int l = A.length();
        boolean res = false;
        for(int i = 0; i <l; i++){
            if(A.charAt(i) == B.charAt(0)){
                res = true;
                for(int j = 0; j < l;j++){
                    if(A.charAt((i+j)%l) != B.charAt(j)){
                        res = false;
                        break;
                    }
                }
                if(res){
                    return res;
                }
            }
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
