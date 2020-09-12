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
    public boolean isSymmetric(TreeNode root) {
           if(root==null) return true;
           return isMirror(root.left, root.right); 
    }
    public boolean isMirror(TreeNode sub1, TreeNode sub2){
           if(sub1==null && sub2==null) return true;
           if(sub1==null || sub2==null) return false;
        
           return (sub1.val==sub2.val) && isMirror(sub1.left,sub2.right) && isMirror(sub1.right,sub2.left);
           
    }
}
