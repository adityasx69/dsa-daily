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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next ==null) return head;
        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}
// Stack Solution O(2n)
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode temp = head;
//         Stack<Integer> stack = new Stack<>();
//         while(temp != null){
//             stack.push(temp.val);
//             temp = temp.next;
//         }
//         ListNode temp1 = head;
//         while(temp1 != null){
//             temp1.val = stack.pop();
//             temp1 = temp1.next;
//         }
//         return head;
//     }
// }
// approach 2 O(n)
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode temp = head;
//         ListNode prev = null;
//         while(temp != null){
//            ListNode front = temp.next;
//            temp.next = prev;
//            prev = temp;
//            temp = front;
//         }
//         return prev;
//     }
// }