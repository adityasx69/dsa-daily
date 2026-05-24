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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count=0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int pos = count-n+1;
        if(pos == 1) return head.next;
        ListNode x = head;
        ListNode prev = null;
        int countNew = 0;
        while(x!=null){
            countNew++;
            if(countNew == pos) break;
            prev = x;
            x = x.next;
        }
        prev.next = x.next;
        return head;
    }
}