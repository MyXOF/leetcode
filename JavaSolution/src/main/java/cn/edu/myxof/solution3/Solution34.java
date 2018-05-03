package cn.edu.myxof.solution3;

public class Solution34 {
    public static int[] searchRange(int[] nums, int target) {
    	if(nums == null || nums.length == 0) return new int[]{-1,-1};
        int l = 0, r = nums.length - 1;
        while(l < r){
        	int mid = l + (r - l) / 2;
        	if(nums[mid] == target){
        		l = mid;
        		break;
        	} else if(nums[mid] > target){
        		r = mid - 1;
        	} else {
        		l = mid + 1;
        	}
        }
        if(nums[l] != target){
        	return new int[]{-1,-1};
        }
        
        int l1 = 0, r1 = l;
        int l2 = l, r2 = nums.length - 1;
        while(l1 < r1){
        	if(l1 + 1 == r1){
        		if(nums[l1] == target){
        			l = l1;
        			break;
        		} else{
        			l = r1;
        			break;
        		}
        	}
        	int mid =  l1 + (r1 - l1) / 2;
        	if(nums[mid] == target){
        		r1 = mid;
        	} else{
        		l1 = mid;
        	}
        }
        while(l2 < r2){
        	if(l2 + 1 == r2){
        		if(nums[r2] == target){
        			r = r2;
        			break;
        		} else{
        			r = l2;
        			break;
        		}
        	}
        	int mid =  l2 + (r2 - l2) / 2;
        	if(nums[mid] == target){
        		l2 = mid;
        	} else{
        		r2 = mid;
        	}        	
        }
    	return new int[]{l,r};
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] res = searchRange(new int[]{1,2,3,3,3,3,4,5,9}, 3);
		System.out.println(res[0]+"--"+res[1]);
	}

}
