package cn.edu.myxof.solution6;

public class Solution605 {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		if(n <= 0) return true;
        if(flowerbed == null || flowerbed.length < 1) return false;
        int len = flowerbed.length;
        if(len == 1){
            if(n == 1 && flowerbed[0] == 0) return true;
            return false;
        }
        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            n--;
        }
        for(int i = 1;i < len-1 && n > 0;i++){
            if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
                n--;
            }
        }
        if(n == 0) return true;
        if(flowerbed[len-1] == 0 && flowerbed[len-2] == 0 && n == 1) return true;
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
