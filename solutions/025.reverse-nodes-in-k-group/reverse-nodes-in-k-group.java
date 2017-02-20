/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        int count=0;
        while(cur!=null&&count!=k){
            count++;
            cur = cur.next;
        }
        if(count==k){
            cur = reverseKGroup(cur,k);
            for(int i=0;i<k;i++){
                ListNode next = head.next;
                head.next = cur;
                cur = head;
                head = next;
            }
            head = cur;
        }
        return head;
        
    }
}