/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null)return head;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode before = newHead;
        for(int i=1;i<m;i++){
            before = before.next;
        }
        ListNode start = before.next;
        ListNode then = start.next;
        for(int i = 0;i<n-m;i++){
            start.next = then.next;
            then.next = before.next;
            before.next = then;
            then = start.next;
        }
        return newHead.next;
    }
}