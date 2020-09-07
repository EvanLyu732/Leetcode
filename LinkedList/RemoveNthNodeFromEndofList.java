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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         if(head == null || head.next==null) return null;
    
         // add an 'dummy' head to return the full list
         ListNode dummy = new ListNode(0);
         dummy.next=head;
        
         int count=0;
         ListNode first=dummy;
         
         while(head!=null){
             //now the head is the last ListNode 
              head=head.next;
              count++;
         }
 
        
         for(int i=0; i<count-n ; i++){
             first=first.next;
         }
        
         //first.next is the deleted ListNode 
         first.next=first.next.next;
        
         return dummy.next;
        
        
    }
}
