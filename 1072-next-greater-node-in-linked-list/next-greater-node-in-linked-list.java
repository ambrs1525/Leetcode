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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer>array = new ArrayList<>();
        while(temp!=null){
            array.add(temp.val);
            temp = temp.next;
        }
        Stack<Integer>stack = new Stack<>();
        int[] ans = new int[array.size()];
        for(int i =0;i<array.size();i++){
            while(!stack.isEmpty()&&array.get(i)>array.get(stack.peek())){
               ans[stack.pop()] = array.get(i);
            }
            stack.push(i);
        }
        return ans;
    }
}