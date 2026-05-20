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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode middleVal = head;
        int count = 0; int middleCount = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        while(middleCount != count/2){
            middleVal = middleVal.next;
            middleCount++;
        }
        return middleVal;
    }
}