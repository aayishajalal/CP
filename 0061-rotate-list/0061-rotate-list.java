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
    public ListNode findNewTail(ListNode head,int k){
        ListNode temp = head;
        int count =1;
        while(temp != null){
            if(count == k)return temp;
            count++;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k ==0)return head;
        //find the last node and point it to head
        int len=1;
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
            len++;
        }
        //edge case
        if(k % len == 0)return head;
        k %= len;
        //tail node points to the head
        tail.next = head;
        ListNode newTail = findNewTail(head,len -k);

        //important that newTail next will the new head
        head = newTail.next;
        newTail.next = null;
        return head;
    }
}