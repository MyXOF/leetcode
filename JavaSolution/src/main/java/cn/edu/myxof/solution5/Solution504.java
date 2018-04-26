package cn.edu.myxof.solution5;

public class Solution504 {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        if(num < 0) return "-"+convertToBase7(-num);
        StringBuilder builder = new StringBuilder();
        while(num != 0){
            builder.append(num % 7);
            num /= 7;
        }
        return builder.reverse().toString();
    }
    
    public String convertToBase7_2(int num) {
    	return Integer.toString(num, 7);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
