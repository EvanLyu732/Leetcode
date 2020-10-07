class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        
        TreeNode cur = root;
        while(cur.val!=val){
            if(cur.val>val){
                if(cur.left==null) cur.left=new TreeNode(val);
                cur=cur.left;
            }else{
                if(cur.right==null) cur.right=new TreeNode(val);
                cur=cur.right;
            }
        }
        return root;
    }
}
