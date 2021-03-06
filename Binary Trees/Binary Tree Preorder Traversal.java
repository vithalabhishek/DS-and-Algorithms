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
class Solution {
     public void Helper(TreeNode root, List<Integer> l)
     {
         if(root == null)
         {
             return ;
         }
         l.add(root.val);
         Helper(root.left,l);
         Helper(root.right,l);
     }
    
     public List<Integer> preorderTraversal(TreeNode root)
     {
         List<Integer> l = new ArrayList<>();
         Helper(root,l);
         return l;
     }
}
