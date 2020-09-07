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
    public ListNode removeElements(ListNode head, int val) {
        while(head !=null && head.val == val){
            head=head.next;
        }
        
        ListNode first=head;
        
        while(first!=null && first.next!=null){
            if(first.next.val==val){
                first.next=first.next.next;
            }else{
                first=first.next;
            }
        }
        return head;

    }
}
