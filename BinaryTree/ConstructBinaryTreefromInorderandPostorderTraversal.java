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
    int pos_idx;
    int[] inorder;
    int[] postorder;
    HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder=postorder;
        this.inorder=inorder;
        
        pos_idx = postorder.length-1;
        
        int idx=0;
        for(Integer val: inorder){
            map.put(val, idx++);
        }
        return helper(0, inorder.length - 1);
    }
    
    public TreeNode helper(int left, int right){
        if(left > right){
            return null;
        }
        
        int root_val = postorder[pos_idx];
        TreeNode root = new TreeNode(root_val);
        
        int index = map.get(root_val);
        
        pos_idx--;
        root.right = helper(index+1, right);
        root.left = helper(left, index-1);
        return root;
    }
}
