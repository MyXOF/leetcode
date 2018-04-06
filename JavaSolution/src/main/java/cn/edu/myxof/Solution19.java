package cn.edu.myxof;

import cn.edu.myxof.utils.ListNode;

public class Solution19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode newHead = new ListNode(0);
		ListNode fast = newHead, slow = newHead;
		newHead.next = head;

		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return newHead.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
