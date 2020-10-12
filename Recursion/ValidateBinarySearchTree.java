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
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
    public boolean helper(TreeNode node, Integer left, Integer right){
        if (node == null) return true;

        int val = node.val;
        if (left != null && val <= left) return false;
        if (right != null && val >= right) return false;

        if (! helper(node.right, val, right)) return false;
        if (! helper(node.left, left, val)) return false;
        return true;
    }
}
