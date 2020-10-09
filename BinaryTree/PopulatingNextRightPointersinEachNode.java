/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node startNode = root;
        while(startNode !=null && startNode.left!=null){
            traverse(startNode);
            startNode = startNode.left;
        }
        return root;
    }
    
    public void traverse(Node startNode){
        Node curr = startNode;
        while(curr!=null){
            //fix first;
            curr.left.next=curr.right;
            //if it is the last node
            if(curr.next!=null){
                 curr.right.next=curr.next.left;    
            }else{
                //set the pointer to null;
                curr.next=null;
            }
            //move to the next node;
            curr=curr.next;
        }
    }
}
