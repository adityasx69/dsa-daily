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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        ListNode tempL = list1;
        ListNode temp2 = list2;
        for(int i=0;i<a-1;i++){
            temp = temp.next;
        }
        for(int j=0;j<b+1;j++){
            tempL = tempL.next;
        }
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        temp.next = list2;
        temp2.next = tempL;
        return list1;
    }
}