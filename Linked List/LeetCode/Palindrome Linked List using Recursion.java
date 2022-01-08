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
    ListNode pleft; 
    public boolean ans(ListNode right){
        if(right == null) return true;
        
        boolean res = ans(right.next);
        if(res == false) return false;
        else if(pleft.val != right.val) return false;
        else
        {
            pleft = pleft.next;
            return true;
        }
    }
    public boolean isPalindrome(ListNode head) {
        pleft = head;
        return ans(head);
    }
}
