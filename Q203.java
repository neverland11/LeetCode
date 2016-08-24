/**
 * Created by Ge on 2016/7/12.
 * 203. Remove Linked List Elements
 * Remove all elements from a linked list of integers that have value val.
 */
public class Q203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        ListNode bef = dummyhead;
        ListNode cur = head;
        int flag = 0;
        while(cur != null){
            if(cur.val == val){
                bef.next = cur.next;
            } else {
                if(flag == 0){
                    dummyhead.next = cur;
                    flag = 1;
                }
                bef = cur;
            }
            cur = cur.next;
        }
        if(bef == dummyhead){
            return null;
        } else {
            return dummyhead.next;
        }


    }
}
