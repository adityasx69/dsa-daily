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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode x = head;
        int sum = 0;
        while(temp != null){
            if(temp.val != 0){
                sum = sum + temp.val;
            }
            else{
                x.val = sum;
                x.next = temp.next;
                x = x.next;
                sum = 0;
            }
            temp = temp.next;
        }
        return head;
    }
}