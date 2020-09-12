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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> save = new ArrayList();
        Stack<TreeNode> stack= new Stack();
        
        while(!stack.isEmpty() || root!=null){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            // the left side has been traversed;
            root=stack.pop();
            save.add(root.val);
            root=root.right;  
        }
        
        return save;
    }
}
