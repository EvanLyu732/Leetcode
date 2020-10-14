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
// A liittle bit confused by why root.right=...

/**If key > root.val then delete the node to delete is in the right subtree root.right = deleteNode(root.right, key).

If key < root.val then delete the node to delete is in the left subtree root.left = deleteNode(root.left, key).

If key == root.val then the node to delete is right here. Let's do it :

-  If the node is a leaf, the delete process is straightforward : root = null.
-  If the node is not a leaf and has the right child, then replace the node value by a successor value root.val = successor.val, and then recursively delete the successor in the right subtree root.right = deleteNode(root.right, root.val).
-  If the node is not a leaf and has only the left child, then replace the node value by a predecessor value root.val = predecessor.val, and then recursively delete the predecessor in the left subtree root.left = deleteNode(root.left, root.val).

Return root.
**/



class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
           if(root==null) return null;
           if(key > root.val){
               root.right=deleteNode(root.right, key);
           }else if(key<root.val){
               root.left=deleteNode(root.left,key);
           }else{
               if(root.left==null && root.right==null) root=null;
               
               else if(root.right!=null){
                   root.val = suc(root);
                   root.right=deleteNode(root.right,suc(root));
               }else{
                   root.val=pre(root);
                   root.left=deleteNode(root.left,pre(root));
               }
           }
        return root;
    }
    
    public int suc(TreeNode root){
          root =root.right;
          while(root.left!=null){
              root=root.left;
          }
          return root.val;
    }
    
    public int pre(TreeNode root){
         root=root.left;
         while(root.right!=null){
             root=root.right;
         }
         return root.val;
    }
}
