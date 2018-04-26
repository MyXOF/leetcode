package cn.edu.myxof.solution1;

public class Solution167 {
    public static int[] twoSum(int[] numbers, int target) {
        if(numbers == null || numbers.length == 0) return null;
        int len = numbers.length;
        int start = 0;
        int end = len - 1;
        while(start <= end){
        	int n = numbers[start]+numbers[end];
        	if(n == target){
        		return new int[]{start+1, end+1};
        	} else if(n < target){
        		start = func1(numbers, target-numbers[end], start, end);
        	} else {
				end = func2(numbers, target-numbers[start], start, end);
			}
        }
        return new int[]{-1,-1};
    }
    
    private static int func1(int[] arr, int target, int start, int end){
    	if(start == end) return start;
        if(start+1 == end){
            return target <= arr[start] ? start : end;
        }
        int mid = start + (end-start)/2;
        int n = arr[mid];
        if(n == target) return mid;
        else if(n > target) return func1(arr, target, start, mid);
        else return func1(arr, target, mid, end);
    }
    
    private static int func2(int[] arr, int target, int start, int end){
    	if(start == end) return start;
        if(start+1 == end){
            return target >= arr[end] ? end : start;
        }
        int mid = start + (end-start)/2;
        int n = arr[mid];
        if(n == target) return mid;
        else if(n > target) return func2(arr, target, start, mid);
        else return func2(arr, target, mid, end);
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,24,50,79,88,150,345};
		int target = 200;
		System.out.println(twoSum(arr, target)[0]+" "+twoSum(arr, target)[1]);
	}

}
