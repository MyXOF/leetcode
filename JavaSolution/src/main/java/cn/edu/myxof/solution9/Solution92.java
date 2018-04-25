package cn.edu.myxof.solution9;

import cn.edu.myxof.utils.ListNode;

public class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == n) return head;
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode parent = fakeHead;
        ListNode curr = head;
        int count = 1;
        while(curr != null && count < m){
            curr = curr.next;
            parent = parent.next;
            count++;
        }
        ListNode last = curr;
        ListNode next1 = curr.next;
        while(count < n){
            ListNode next2 = next1.next;
            next1.next = curr;
            curr = next1;
            next1 = next2;
            count++;
        }
        parent.next = curr;
        last.next = next1;    
        return fakeHead.next;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
