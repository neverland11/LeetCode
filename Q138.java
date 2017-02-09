import java.util.HashMap;

/**
 * Created by Ge on 2016/11/30.
 * 138. Copy List with Random Pointer
 * A linked list is given such that each node contains an additional random pointer which could point to any node in
 * the list or null.
 * Return a deep copy of the list.
 */

class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
};


public class Q138 {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null){
            return head;
        }

        //use hashmap to store relationships.
        HashMap<RandomListNode, RandomListNode> relation = new HashMap<>();
        RandomListNode newhead = new RandomListNode(head.label);
        RandomListNode use = head;
        RandomListNode newuse = newhead;
        relation.put(head, newhead);
        use = use.next;
        while(use != null){
            RandomListNode node = new RandomListNode(use.label);
            newuse.next = node;
            relation.put(use, node);
            newuse = newuse.next;
            use = use.next;
        }

        use = head;
        while(use != null){
            //the random of use-relation node is the relation to use related node
            relation.get(use).random = relation.get(use.random);
            use = use.next;
        }

        return newhead;
    }
}
