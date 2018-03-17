package cn.edu.myxof;

/**
 * Definition for singly-linked list. 
 * public class ListNode { 
 *       int val; 
 *       ListNode next; 
 *       ListNode(int x) { val = x; } 
 *  }
 */
public class Solution2 {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode((l1.val + l2.val) % 10);
		ListNode p = result;
		int nextValue = (l1.val + l2.val) / 10;
		l1 = l1.next;
		l2 = l2.next;
		while (l1 != null || l2 != null) {
			if (l1 != null && l2 != null) {
				int value = l1.val + l2.val + nextValue;
				ListNode tmp = new ListNode(value % 10);
				nextValue = value / 10;
				p.next = tmp;
				p = tmp;
				l1 = l1.next;
				l2 = l2.next;
			} else if (l1 == null && l2 != null) {
				int value = l2.val + nextValue;
				ListNode tmp = new ListNode(value % 10);
				nextValue = value / 10;
				p.next = tmp;
				p = tmp;
				l2 = l2.next;
			} else {
				int value = l1.val + nextValue;
				ListNode tmp = new ListNode(value % 10);
				nextValue = value / 10;
				p.next = tmp;
				p = tmp;
				l1 = l1.next;
			}
		}
		if (nextValue != 0) {
			ListNode tmp = new ListNode(nextValue);
			p.next = tmp;
			p = tmp;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
