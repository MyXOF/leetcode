package cn.edu.myxof.solution2;

public class Solution239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
    	if(nums == null || nums.length < k || k <= 0){
    		return new int[0];
    	}
        int len = nums.length;
        int[] res = new int[len-k+1];
        MyQueue queue = new MyQueue(k);
        for(int i = 0; i < k;i++){
        	queue.enQueue(nums[i]);
        }
        res[0] = queue.max();
        for(int i = k; i < len;i++){
        	queue.deQueue();
        	queue.enQueue(nums[i]);
        	res[i-k+1] = queue.max();
        }
        return res;
    }

    class MyStack{
		private int[] nums;
		private int[] nextMax;
		private int maxIndex;
		private int topIndex;
		
		public MyStack(int k){
			this.nums = new int[k];
			this.nextMax = new int[k];
			this.maxIndex = -1;
			this.topIndex = -1;
		}
		
		public void push(int n){
			topIndex++;
			nums[topIndex] = n;
			if(n > max()){
				nextMax[topIndex] = maxIndex;
				maxIndex = topIndex;
			} else{
				nextMax[topIndex] = -1;
			}
		}
		
		public int pop(){
			int res = nums[topIndex];
			if(topIndex == maxIndex){
				maxIndex = nextMax[topIndex];
			}
			topIndex--;
			return res;
		}
		
		public int max(){
			return maxIndex >= 0 ? nums[maxIndex] : Integer.MIN_VALUE;
		}
		
		public boolean isEmpty(){
			return topIndex < 0;
		}
	}
	
	class MyQueue{
		private MyStack stackA;
		private MyStack stackB;
		
		public MyQueue(int k){
			stackA = new MyStack(k);
			stackB = new MyStack(k);
		}
		
		public void enQueue(int n){
			stackB.push(n);
		}
		
		public int max(){
			return Math.max(stackA.max(), stackB.max());
		}
		
		public int deQueue(){
			if(stackA.isEmpty()){
				while(!stackB.isEmpty()){
					stackA.push(stackB.pop());
				}
			}
			return stackA.pop();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
