package cn.edu.myxof.solution2;

import cn.edu.myxof.utils.ListNode;

public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
    	if(lists == null || lists.length == 0){
            return null;
        }
        return func(lists, 0, lists.length-1);
    }
    
    private ListNode func(ListNode[] lists, int start, int end){
    	if(start == end) return lists[start];
    	if(start + 1 == end) return merge(lists[start], lists[end]);
    	if(start > end) return null;
    	int mid = start + (end-start)/2;
    	return merge(func(lists, start, mid), func(lists, mid+1, end));
    }
    
    private ListNode merge(ListNode l1, ListNode l2){
    	if(l1 == null && l2 == null){
    		return null;
    	} else if (l1 == null && l2 != null) {
			return l2;
		} else if (l1 != null && l2 == null) {
			return l1;
		}
    	ListNode node,l,r,curr;
    	if(l1.val > l2.val){
    		node = new ListNode(l2.val);
    		l = l1;
    		r = l2.next;
    	} else{
    		node = new ListNode(l1.val);
    		l = l1.next;
    		r = l2;
    	}
    	curr = node;
    	while(l != null && r != null){
    		ListNode tmp;
        	if(l.val > r.val){
        		tmp = new ListNode(r.val);
        		r = r.next;
        	} else{
        		tmp = new ListNode(l.val);
        		l = l.next;
        	}
        	curr.next = tmp;
    		curr = curr.next;
    	}
    	if(l != null){
    		curr.next = l;
    	}
    	if(r != null){
    		curr.next = r;
    	}
    	return node;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
