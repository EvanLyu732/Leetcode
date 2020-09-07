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

//1. Find the end of the first half.
//2. Reverse the second half.
//3. Determine whether or not there is a palindrome.
//4. Restore the list.
//5. Return the result.

class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head==null) return true;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //now slow is at the end of the first half.
        slow=reversed(slow);
        fast=head;
        
        while(slow!=null){
            if(slow.val!=fast.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        
        return true;
    
    }
    
    public ListNode reversed(ListNode head){
        
        ListNode prev=null;
        
        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
        
    }
}
