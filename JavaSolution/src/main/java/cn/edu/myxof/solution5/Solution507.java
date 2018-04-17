package cn.edu.myxof.solution5;

public class Solution507 {
	public static int func(int p){
		return (1 << (p-1)) * ((1 << p) - 1);
	}
	
    public boolean checkPerfectNumber(int num) {
        if(num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336){
        	return true;
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,7,13,17,19,31};
		for(int n : arr){
			System.out.println(func(n));
		}
	}

}
