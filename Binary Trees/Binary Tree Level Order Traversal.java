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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
        {
            return new ArrayList<>();
        }
        
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        int level = 0;
        
        queue.addLast(root);
        while(queue.size()!=0)
        {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            while(size -- > 0)
            {
                TreeNode popnode = queue.removeFirst();
                temp.add(popnode.val);
                
                if(popnode.left!=null)
                {
                    queue.addLast(popnode.left);
                }
                if(popnode.right!=null)
                {
                    queue.addLast(popnode.right);
                }
            }
            level++;
            ans.add(new ArrayList<>(temp));
        }
        return ans;
    }
}
