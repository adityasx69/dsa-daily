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
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        ListNode x = new ListNode(-1);
        ListNode newNode = x;
        for(int i=0;i<Math.floor(count/k);i++){
            for(int j=0;j<k;j++){
                stack.push(temp);
                temp = temp.next;
            }
            while(!stack.isEmpty()){
                newNode.next = stack.pop();
                newNode = newNode.next;
            }
        }
        newNode.next = temp;
        return x.next;
    }
}