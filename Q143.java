import java.util.List;

/**
 * Created by Ge on 2016/7/12.
 * 143. Reorder List
 *
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 * You must do this in-place without altering the nodes' values.
 */
public class Q143 {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode fast = head, slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next; //slow is the middle one
        }
        ListNode temp = slow.next;
        slow.next = null;
        slow = temp;
        temp = temp.next;
        slow.next = null;
        while(temp != null){ //temp is at the end
            ListNode next = temp.next;
            temp.next = slow;
            slow = temp;
            temp = next;
        }
        temp = slow;

        ListNode start = head;
        while(temp != null && start != null) {
            ListNode next = start.next;
            ListNode next2 = temp.next;
            start.next = temp;
            temp.next = next;
            start = next;
            temp = next2;
        }
    }
}
