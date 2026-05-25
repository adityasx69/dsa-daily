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
    public static ListNode reverse(ListNode head){
        if(head == null || head.next ==null) return head;
        ListNode newNode = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newNode;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next ==null) return true;
        ListNode slow = head; ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newNode = reverse(slow.next);
        ListNode left = head;
        ListNode right = newNode;
        while(right != null){
            if(left.val != right.val){
                reverse(slow.next);
                return false;
            }
            left = left.next;
            right = right.next;
        }
        reverse(slow.next);
        return true;
    }
}
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ListNode temp = head;
//         Stack<Integer> st = new Stack<>();
//         boolean x = false;
//         while(temp != null){
//             st.push(temp.val);
//             temp = temp.next;
//         }
//         temp = head;
//         while(temp != null){
//             if(temp.val == st.pop()){
//                 x = true;
//             }
//             else{
//                 x = false;
//             }
//             temp = temp.next;
//         }
//         return x;
//     }
// }