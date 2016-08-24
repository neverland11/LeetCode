/**
 * Created by Ge on 2016/6/28
 * 147. Insertion Sort List.
 */

import java.util.List;

/**
1 插入排序，从左到右遍历所有节点。因为是单链表，每次从头结点往后比较
2 每一轮开始时，sortedhead更新为已排序链表的首节点，并且随着比较的进行更新
3 当满足cur->val < temp.next->val时，将cur节点插入到temp与temp.next之间
**/

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Q147 {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode sortedhead = head;
        ListNode cur = head.next;//head.next is the first node that need to be sorted.
        int length = 0;
        ListNode last = sortedhead;

        while(cur != null) {
            length++;
            ListNode temp = sortedhead;
            ListNode next = cur.next;

            if(cur.val < sortedhead.val){
                cur.next = sortedhead;
                sortedhead = cur;
                cur = next;
                continue;
            }

            if(cur.val > last.val){
                last.next = cur;
                last = cur;
                cur = next;
                continue;
            }

            while(temp != cur){
                if(cur.val < temp.next.val){
                    cur.next = temp.next;
                    temp.next = cur;
                    break;
                }
                temp = temp.next;
            }
            cur = next;
        }

        cur = sortedhead;
        for(int i = 0; i < length; i++){
            cur = cur.next;
        }
        cur.next = null;
        return sortedhead;
    }
}

/*
网上另一个解法
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummyHead = new ListNode(0), p = head;
        dummyHead.next = head;
        while(p.next != null) {
            if(p.val <= p.next.val) {  //p 的值小于等于下一节点，不移动，向后。
                p = p.next;
            } else { //p.next需要sorted
                ListNode temp = p.next, q = dummyHead;
                p.next = p.next.next; //跳过p.next(因为要排序，无视了他）
                while(q.next.val < temp.val)  //找到第一个大于该节点的前一节点
                    q = q.next;
                temp.next = q.next;  //将 temp 节点插入
                q.next = temp;
            }
        }
        return dummyHead.next;
    }
}
 */
