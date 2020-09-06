/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
      
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                //there is a cycle, set one of Node to the head
                slow = head;
                break;
            }
        }
        
        if(fast == null || fast.next == null) return null;
        
    
        while(slow != fast){
            fast = fast.next;
            slow = slow.next;
        }
        
        return slow;
    }
}
