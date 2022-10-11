/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
        //IF TAIL CASE IS INCLUDED
        // CHECK WITH IF ELSE CONDITION AND IF IT IS A TAIL NODE, ASSIGN NULL VAL TO THAT NODE.
        
    }
}