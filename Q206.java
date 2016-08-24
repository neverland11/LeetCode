/**
 * Created by Ge on 2016/7/7.
 * 206. Reverse Linked List
 * Reverse a singly linked list.
 */
public class Q206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode temp = head.next;
        ListNode prev = head;
        head.next = null;
        while(temp != null){
            ListNode next = temp.next;
            temp.next = prev;
            if(next == null){
                return temp;
            }
            prev = temp;
            temp = next;
        }

        return temp;

    }
}
