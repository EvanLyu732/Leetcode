/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode();
        temp.next=head;
        ListNode cur=temp;
        
        while(cur.next!=null && cur.next.next!=null){
            ListNode first=cur.next;
            ListNode second=cur.next.next;
            //swap
            first.next=second.next;
            cur.next=second;
            cur.next.next=first;
            //jumping 2 node
            cur=cur.next.next;
        }
        
        return temp.next;   
    }
}
