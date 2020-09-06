/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if (headA==null || headB==null) return null;
        
        ListNode Anext=headA;
        ListNode Bnext=headB;
        
        while(Anext!=Bnext){
            
            if(Anext==null){
                Anext=headB;
            }else{
                Anext=Anext.next;
            }
        
            if(Bnext==null){
                Bnext=headA;
            }else{
                Bnext=Bnext.next;
            }
        }
    
        return Anext;
    
