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
    public int maxDepth(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        depth(root, result, 0);
        return result.size();
        
    }
    public void depth(TreeNode root,List<Integer> result, int count){
         if(root == null){
            return;
        }
        if(count == result.size()){
            result.add(root.val);
        }
        
        depth(root.right, result, count + 1);
        depth(root.left, result, count + 1);
            
    }
}