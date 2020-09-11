/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
           if(head == null) return null;
           Map<Node,Node > map=new HashMap< >();
           Node cur=head;
           //loop through all nodes;
           while(cur!=null){
               map.put(cur, new Node(cur.val, null,null));
               cur=cur.next;
           }
           //loop and copy the pointers
           cur=head;
           while(cur!=null){
               map.get(cur).next=map.get(cur.next);
               map.get(cur).random=map.get(cur.random);
               cur=cur.next;
           }
           
           return map.get(head);
        
    }
}
