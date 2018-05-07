package cn.edu.myxof.solution1;

import cn.edu.myxof.utils.ListNode;

public class Solution148 {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
    	ListNode fast = head,slow = head,pre = null;
    	
    	while(fast != null && slow != null){
    		pre = slow;
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	pre.next = null;
    	ListNode l1 = sortList(head);
    	ListNode l2 = sortList(slow);
    	return merge(l1, l2);
    }
    
    private ListNode merge(ListNode l1, ListNode l2){
    	ListNode head = new ListNode(0);
    	ListNode p = head;
    	while(l1 != null && l2 != null){
    		if(l1.val > l2.val){
    			p.next = l1;
    			l1 = l1.next;
    		} else{
    			p.next = l2;
    			l2 = l2.next;
    		}
    		p = p.next;
    	}
    	if(l1 != null){
    		p.next = l1;
    	}
    	if(l2 != null){
    		p.next = l2;
    	}
    	return head.next;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
