/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int idx = len(head);
        if(idx == 1)return null;
        int c = 0;
        ListNode temp = head;
        while(temp != null){
            c++;
            if(c == idx/2){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }
    public int len(ListNode head){
        int c = 0;
        ListNode temp = head;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        return c;
    }
}