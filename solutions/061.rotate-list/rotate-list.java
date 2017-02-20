/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        k = k%length;
        ListNode l1 = head,l2 = head;
        if(k==0)return l1;
        for(int i=0;i<k;i++){
            l2 = l2.next;
        }
        while(l2.next!=null){
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode newHead = l1.next;
        l1.next = null;
        l2.next = head;
        return newHead;
        
    }
}