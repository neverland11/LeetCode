/**
 * Created by Ge on 2016/11/7.
 * 21. Merge Two Sorted Lists
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */

import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Q21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = l1;
        if(l1 == null && l2 != null){
            return l2;
        } else if (l2 == null && l1 != null){
            return l1;
        } else if (l1 == null && l2 == null){
            return res;
        }

        ListNode cur1 = l1;
        ListNode cur2 = l2;

        if(l1.val < l2.val){
            res = l1;
            cur1 = cur1.next;
        } else {
            res = l2;
            cur2 = cur2.next;
        }

        ListNode temp = res;
        while(cur1 != null && cur2 != null){
            if(cur1.val < cur2.val){
                temp.next = cur1;
                temp = temp.next;
                cur1 = cur1.next;
            } else {
                temp.next = cur2;
                temp = temp.next;
                cur2 = cur2.next;
            }
        }
        if(cur1 == null){
            temp.next = cur2;
        } else {
            temp.next = cur1;
        }

        return res;
    }
}
