/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null)
            return head;
        ListNode Sintenal = new ListNode(0);
        Sintenal.next = head;
        ListNode curr = Sintenal.next;
        ListNode precurr = Sintenal;
        
        while(curr != null && curr.val < x){
            precurr = curr;
            curr = curr.next;
        }

        // now here we are at the first node that bigger than x
        // after them we should remove them add them next to it
        if(curr == null){
            return head;
        }
        Queue<ListNode> queue = new ArrayDeque<>();
        ListNode mover = curr.next;
        ListNode preMover = curr;
        while(mover != null){
            if(mover.val < x){
                queue.add(mover);
                preMover.next = mover.next;
                mover = preMover;
            }else{
                preMover = mover;
                mover = mover.next;
            }
        }

        while(!queue.isEmpty()){
            System.out.println(queue.peek().val);
            precurr.next = queue.remove();
            precurr = precurr.next;
        }
        precurr.next = curr;
        return Sintenal.next;

    }
}