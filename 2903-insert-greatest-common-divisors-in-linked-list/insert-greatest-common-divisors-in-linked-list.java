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
    public int gcd(int x,int y){
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return Math.abs(x);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
         if (head == null || head.next == null) return head;

        ListNode a = head;
        ListNode b = a.next;

        while(b!=null){
           int result = gcd(a.val,b.val);
           ListNode newNode = new ListNode(result);
           a.next = newNode;
           newNode.next = b;
           a =b;
           b=b.next;

        }
        return head;
    }
}