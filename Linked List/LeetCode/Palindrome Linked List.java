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
    public ListNode middle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head)
    {
        ListNode dummy = null;
        while(head != null)
        {
            ListNode node = head.next;
            head.next = dummy;
            dummy = head;
            head = node;
        }
        return dummy;
    }
    public boolean isPalindrome(ListNode head) 
    {
        ListNode mid = middle(head);
        
        ListNode thead = mid.next;
        mid.next = null;
        
        ListNode rev = reverse(thead);
        
        ListNode p1 = head;
        ListNode p2 = rev;
        
        while(p1 != null && p2 != null )
        {
            if(p1.val != p2.val)
            {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}
