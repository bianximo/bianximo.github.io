/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null)return null;
        ListNode lowHead = new ListNode(-1),low = lowHead;
        ListNode highHead = new ListNode(1),high = highHead;
        ListNode current = head;
        while(current!=null){
            if(current.val<x){
                low.next = current;
                low = low.next;
            }else{
                high.next = current;
                high = high.next;
            }
            current = current.next;
        }
        high.next = null;
        low.next = highHead.next;
        return lowHead.next;
    }
}