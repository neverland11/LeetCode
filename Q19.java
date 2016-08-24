/**
 * Created by Ge on 2016/7/12.
 * 19. Remove Nth Node From End of List
 * Given a linked list, remove the nth node from the end of list and return its head.
 */
public class Q19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode end = head;
        for(int i = 1; i < n; i++){
            end = end.next;
        }
        if(end.next == null){
            return head.next;
        }
        ListNode before = head;
        ListNode cur = head;
        while(end.next != null){
            before = cur;
            cur = cur.next;
            end = end.next;
        }
        before.next = cur.next;
        return head;
    }
}
