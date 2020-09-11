/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        
        if(head == null){
            Node node = new Node(insertVal, null);
            node.next=node;
            return node;
        }
        
        // find max and min
        Node max = head;
        while(max.next!=head && max.val<= max.next.val){
            max = max.next;
        }
        
        Node min = max.next, cur=min;
        
        //if it is greater than max or smaller than min/
        if(insertVal >= max.val || insertVal <=min.val){
            Node node = new Node(insertVal, min);
            max.next = node;
            
         //find corresponding pos
        }else{
            while(cur.next.val< insertVal){
                cur=cur.next;
            }
            
            Node node = new Node(insertVal, cur.next);
            cur.next=node;
        }
        
        return head;
        
    }
}
