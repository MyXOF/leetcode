package cn.edu.myxof.solution1;

public class Solution135 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ratings = {1,0,2};
        int len = ratings.length;

        int count = ratings[0] > ratings[1] ? 1 : 0;
        int left = count;
        for(int i = 1; i < len;i++){
            if(ratings[i] <= ratings[i-1]){
                left = 0;
            } else{
                left++;
                count += left;
            }
        }
        System.out.println(count+len);
	}

}
