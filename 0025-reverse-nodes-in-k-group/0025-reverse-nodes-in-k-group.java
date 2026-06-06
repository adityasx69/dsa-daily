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
    ListNode reverse(ListNode temp){
        ListNode prev = null;
        ListNode curr = temp;

        while(curr!=null){
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }

    ListNode findKthNode(ListNode temp, int k){
        k--;
        while(temp != null && k > 0){
            temp = temp.next;
            k--;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode kthEle = findKthNode(temp,k);
            if(kthEle == null){
                if(prev != null){
                    prev.next = temp;
                }
                break;
            }
            ListNode newNode = kthEle.next;
            kthEle.next = null;
            reverse(temp);
            if(temp == head){
                head = kthEle;
            }
            else{
                prev.next = kthEle;
            }
            prev = temp;
            temp = newNode;
        }
        return head;
    }
}