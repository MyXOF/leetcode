package cn.edu.myxof.solution6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
		int index = Arrays.binarySearch(arr, x);
		List<Integer> res = new ArrayList<>();
		int len = arr.length;
		int smallIndex, bigIndex;
		List<Integer> smallList = new ArrayList<>();
		List<Integer> bigList = new ArrayList<>();
		if (index < 0) {
			index = -(index + 1);
			smallIndex = index-1;
			bigIndex = index;
		} else{
			smallIndex = index;
			bigIndex = index +1;
		}
		
		while(smallIndex >= 0 && bigIndex < len && k > 0){
			if(Math.abs(arr[smallIndex] - x) <= Math.abs(arr[bigIndex] - x)){
				smallList.add(smallIndex);
				smallIndex--;
			} else{
				bigList.add(bigIndex);
				bigIndex++;
			}
			k--;
		}
		
		if(k > 0){
			if(smallIndex >= 0){
				while(k > 0){
					smallList.add(smallIndex);
					smallIndex--;
					k--;
				}
			} else if(bigIndex < len){
				while(k > 0){
					bigList.add(bigIndex);
					bigIndex++;
					k--;
				}
			}
		}
		for(int i = smallList.size() - 1; i >=0;i--){
			res.add(arr[smallList.get(i)]);
		}
		for(int i = 0; i < bigList.size();i++){
			res.add(arr[bigList.get(i)]);
		}
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {0,0,1,2,3,3,4,7,7,8};
//		int[] arr = {1};
//		int k = 3;
//		int x = 5;

	}

}
