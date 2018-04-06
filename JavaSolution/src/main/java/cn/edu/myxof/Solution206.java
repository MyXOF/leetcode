package cn.edu.myxof;

import cn.edu.myxof.utils.ListNode;

public class Solution206 {
	
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;
        while(curr !=  null){
            ListNode tmp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = tmp;
        }
        return pre;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
