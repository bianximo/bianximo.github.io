/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        ListNode current1 = l1,current2 = l2;
        int add = 0;
        while(current1!=null&&current2!=null){
            int sum = current1.val+current2.val+add;
            if(sum>=10){
                add = 1;
                sum-=10;
            }else add = 0;
            cur.next = new ListNode(sum);
            cur = cur.next;
            current1 = current1.next;
            current2 = current2.next;
        }
        while(current1!=null){
            int sum = current1.val+add;
            if(sum>=10){
                add = 1;
                sum-=10;
            }else add = 0;
            cur.next = new ListNode(sum);
            cur = cur.next;
            current1 = current1.next;
        }while(current2!=null){
            int sum = current2.val+add;
            if(sum>=10){
                add = 1;
                sum-=10;
            }else add = 0;
            cur.next = new ListNode(sum);
            cur = cur.next;
            current2 = current2.next;
        }
        if(add==1)cur.next = new ListNode(1);
        return newHead.next;
    }
}