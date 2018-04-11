package cn.edu.myxof.solution2;

import cn.edu.myxof.utils.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution21 {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode result = null;
		ListNode tmp = null;
		if (l1 == null && l2 == null) {
		} else if (l1 != null && l2 == null) {
			result = l1;
		} else if (l1 == null && l2 != null) {
			result = l2;
		} else {
			if (l1.val > l2.val) {
				result = new ListNode(l2.val);
				l2 = l2.next;
			} else {
				result = new ListNode(l1.val);
				l1 = l1.next;
			}
			tmp = result;
			while (l1 != null || l2 != null) {
				if (l1 != null && l2 == null) {
					tmp.next = new ListNode(l1.val);
					l1 = l1.next;

				} else if (l1 == null && l2 != null) {
					tmp.next = new ListNode(l2.val);
					l2 = l2.next;
				} else {
					if (l1.val > l2.val) {
						tmp.next = new ListNode(l2.val);
						l2 = l2.next;
					} else {
						tmp.next = new ListNode(l1.val);
						l1 = l1.next;
					}
				}
				tmp = tmp.next;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
