/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//code by @lucianboboc 

class Solution {
    TreeNode suc=null,prev=null;
    boolean found = false;
    
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root == null){
            return null;
        }
        traverse(root,p);
        return found? suc:null;
    }
    public void traverse(TreeNode root, TreeNode p){
        if(root == null) return;
    
        traverse(root.left,p);
        // a little bit confuse about this part, why it can't put one line forward.
        if(prev!=null && prev.val==p.val){
            found = true;
            suc = root;
        }
        
        prev = root;
        traverse(root.right,p);
    }
}
