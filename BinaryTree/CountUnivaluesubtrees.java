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

public class Solution {
    public int countUnivalSubtrees(TreeNode root) {
      int[] count = new int[1];
      // bottom up search;
      helper(root, count);
      return count[0];
    }
    
    public boolean helper(TreeNode root, int[] count){
        if(root==null){
            return true;
        }
        boolean  isLeft=helper(root.left, count);
        boolean  isRight=helper(root.right, count);
        
        // if one child is null. then it is true for this child;
        // only when both child exist while they have different value from parent.
        if(isLeft && isRight){
            if(root.left !=null && root.val != root.left.val){
                return false;
            }
            if(root.right!=null && root.val != root.right.val){
                return false;
            }
            count[0]++;
            return true;
        }
        return false;
    }
}
