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
        int cnt =0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        if(cnt==1) return head;
      temp = head;

      for(int i =1;i<cnt/2;i++){
        temp= temp.next;
      }
     
      return temp.next;
    }
}
