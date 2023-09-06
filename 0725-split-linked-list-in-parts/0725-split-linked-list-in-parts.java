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
    public ListNode[] splitListToParts(ListNode head, int k) {
 ListNode[] res = new ListNode[k];

        if (head == null) {
            return res;
        }

        ListNode curNode = head;
        int count = 0;

        while (curNode != null) {
            curNode = curNode.next;
            ++count;
        }

        int size = count / k, rem = count % k;

        curNode = head;
        for (int i = 0; i < k; i++) {
            ListNode root = curNode;
            for (int j = 0; j < size + (i < rem ? 1 : 0) - 1; j++) {
                if (curNode != null) {
                    curNode = curNode.next;
                }
            }

            if (curNode != null) {
                ListNode preNode = curNode;
                curNode = curNode.next;
                preNode.next = null;
            }
            res[i] = root;
        }
        return res;
    }
}