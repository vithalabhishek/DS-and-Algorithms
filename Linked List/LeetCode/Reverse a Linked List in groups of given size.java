Problem : Reverse a linked list as per a given chunk size “k”.

Input: 2 -> 10 -> 20 -> 40 -> 5 -> 6 -> 17 -> 19 -> NULL

K = 3
Output : 20 -> 10 -> 2 -> 6 -> 5 -> 40 -> 19 -> 17 -> NULL

K = 4
Output : 40 -> 20 -> 10 -> 2 -> 19 -> 17 -> 6 -> 5 -> NULL

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
    public ListNode reverseList(ListNode head, int k)
    {
	    if(head == null)
        return null;
  
      Node dummy = head;
      Node next = null;
      Node prev = null;
  
      int count = 0;
      while(count < k && dummy != null)
      {
        next = dummy.next;  //10
        dummy.next = prev; // null
        prev = dummy;
        dummy = next;
        count ++;
      }
  	
      if(next != null)
      {
  	    head.next = reverse(next , k);
      }
  
  return prev;
}
