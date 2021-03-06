/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)return head;
        Map<Integer,Integer>map = new HashMap<>();
        ListNode current = head;
        while(current!=null){
            if(map.containsKey(current.val)){
                map.put(current.val,map.get(current.val)+1);
            }else{
                map.put(current.val,1);
            }
            current = current.next;
        }
        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        current = head;
        while(current!=null){
            if(map.get(current.val)==1){
                temp.next = current;
                current = current.next;
                temp = temp.next;
            }else{
                current = current.next;
            }
        }
        temp.next = null;
        return newHead.next;
    }
}