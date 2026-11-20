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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer>arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp= temp.next;
        }
        int mid = arr.size()/2;
        Stack<Integer>s = new Stack<>();
        for(int i=0;i<mid;i++){
              s.push(arr.get(i));
        }
         int start = (arr.size() % 2 == 0) ? mid : mid + 1;
        for(int i =start;i<arr.size();i++){
            if(!arr.get(i).equals(s.peek())){
                 return false;
            }
            s.pop();
        }
        return s.isEmpty();

    }
}