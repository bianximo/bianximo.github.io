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
        if(headA==null||headB==null)return null;
        ListNode currentA = headA,currentB = headB;
        int lengthA = getLength(headA),lengthB = getLength(headB);
        int step = lengthA-lengthB;
        if(step>0){
            for(int i=0;i<Math.abs(step);i++)currentA = currentA.next;
        }else{
            for(int i=0;i<Math.abs(step);i++)currentB = currentB.next;
        }
        while(currentA!=null&&currentB!=null){
            if(currentA==currentB)return currentA;
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return null;
    }
    public int getLength(ListNode head){
        ListNode current = head;
        int length = 0;
        while(current!=null){
            length++;
            current = current.next;
        }
        return length;
    }
}