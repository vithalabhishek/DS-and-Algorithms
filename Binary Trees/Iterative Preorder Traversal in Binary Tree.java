/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//using stack data structure 
//Time Complexity : O(N) because travelling for every node.
//Space Complexity : O(N) or O(Height of binary tree) because worst case scenario, every parent has right child.
class Solution {
     public List<Integer> preorderTraversal(TreeNode root)
     {
         List<Integer> preorder = new ArrayList<Integer>();
         if(root == null) return preorder; 
         Stack<TreeNode> st = new Stack<TreeNode>();
         st.push(root);
         while(!st.isEmpty())
         {
             root = st.pop();
             preorder.add(root.val);
             if(root.right != null)
             {
                 st.push(root.right);
             }
             if(root.left != null)
             {
                 st.push(root.left);
             }
         }
         return preorder;
     }
}
