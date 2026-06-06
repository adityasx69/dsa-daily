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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode temp = head;
        int count = 1;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        k %= count;
        if(k==0) return head;
        ListNode x = head;
        int move = count-k-1;
        for(int i=0;i<move;i++){
            x = x.next;
        }
        ListNode newNode = x.next;
        x.next = null;
        temp.next = head;
        return newNode;

    }
}