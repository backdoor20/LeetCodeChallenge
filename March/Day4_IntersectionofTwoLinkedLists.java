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
        int l1=length(headA);
        int l2=length(headB);
        if(l1<l2){
            ListNode temp=headA;
            headA=headB;
            headB=temp;
            int l=l1;
            l1=l2;
            l2=l;            
        }
        int diff=l1-l2;
        while(diff>0){
            headA=headA.next;
            diff--;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
    
    int length(ListNode root){
        if(root==null)
            return 0;
        return 1+length(root.next);
    }
}