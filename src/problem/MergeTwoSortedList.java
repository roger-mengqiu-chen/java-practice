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
	public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
		if(list2 == null) return list1;
		
		ListNode head = null, tail = null;
		if(list1.val <= list2.val) {
			head = tail = list1;
			list1 = list1.next;
		}
		else {
			head = tail = list2;
			list2 = list2.next;
		}
		
		while (list1 != null && list2 != null) {
			if(list1.val <= list2.val) {
				tail.next = list1;
				tail = tail.next;
				list1 = list1.next;
			}
			else {
				tail.next = list2;
				tail = tail.next;
				list2 = list2.next;
			}
		}
		
		if (list1 == null) {
			tail.next = list2;
		}
		else {
			tail.next = list1;
		}
		
		return head;
    }
}
