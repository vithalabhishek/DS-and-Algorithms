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
        ListNode next = head;
        int count = 0;
        while(next != null)
        {
            next = next.next;
            count++;
        }
        
        ListNode ans = head;
        for(int i = 0; i < count/2; i++)
        {
            ans = ans.next;
        }
        return ans;
        
    }
}
