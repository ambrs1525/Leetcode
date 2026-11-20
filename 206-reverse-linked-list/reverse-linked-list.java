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
        ListNode curr= head;
        ListNode p1 = null;
        ListNode p2 = null;
        while(curr!=null){
            p2 = curr.next;
            curr.next = p1;
            p1 = curr;
            curr = p2;
        }

        return p1;
    }
}