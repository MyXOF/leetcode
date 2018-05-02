package cn.edu.myxof.solution3;

import cn.edu.myxof.utils.ListNode;

public class Solution328 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        ListNode odd = head, even = head.next, evenHead = even;
        while(odd.next != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
