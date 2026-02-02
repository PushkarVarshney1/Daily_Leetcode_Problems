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
    public int getDecimalValue(ListNode head) {
        int len = size(head);
        ListNode temp = head;
        int ans = 0;

        while(temp != null){
            len--;
            ans += temp.val * Math.pow(2,len);
            temp = temp.next;
        }
        return ans;
    }
    public int size(ListNode head){
        int c = 0;
        ListNode temp = head;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        return c;
    }
}