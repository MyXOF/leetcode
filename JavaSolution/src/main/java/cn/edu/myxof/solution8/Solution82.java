package cn.edu.myxof.solution8;

import cn.edu.myxof.utils.ListNode;

public class Solution82 {
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode fakeHead = new ListNode(0);
		fakeHead.next = head;
		ListNode curr = head;
        ListNode parent = fakeHead;
		while (curr != null) {
			if (curr.next != null && curr.val == curr.next.val) {
                int val = curr.val;
                while(curr != null && curr.val == val){
                    curr = curr.next;
                }
                parent.next = curr;
			} else {
				curr = curr.next;
                parent = parent.next;
			}
		}
		return fakeHead.next;
	}
	
	private static void print(ListNode head){
		ListNode curr = head;
		while(curr != null){
			System.out.print(curr.val+"->");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next = new ListNode(5);
		ListNode res = deleteDuplicates(head);
		print(res);
	}

}
