package problem;

import MockClass.ListNode;

/**
 * 21
 *
 */
public class MergeTwoSortedList {
	
	/**
	 * Recursive solution
	 */
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
        if(list1 == null) return list2;
        
        if(list2 == null) return list1;
        
        if(list1.val < list2.val) {
        	list1.next = mergeTwoLists(list1.next, list2);
        	return list1;
        }
        
        else {
        	list2.next = mergeTwoLists(list1, list2.next);
        	return list2;
        }
    }
	
	/**
	 * Non recursive solution
	 */
	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		ListNode head = null, tail = null;
		if(l1.val <= l2.val) {
			head = tail = l1;
			l1 = l1.next;
		}
		else {
			head = tail = l2;
			l2 = l2.next;
		}
		
		while (l1 != null && l2 != null) {
			if(l1.val <= l2.val) {
				tail.next = l1;
				tail = tail.next;
				l1 = l1.next;
			}
			else {
				tail.next = l2;
				tail = tail.next;
				l2 = l2.next;
			}
		}
		
		if (l1 == null) {
			tail.next = l2;
		}
		else {
			tail.next = l1;
		}
		
		return head;
    }
}
