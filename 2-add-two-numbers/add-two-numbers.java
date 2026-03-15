class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        int sum = 0;
        int c = 0;
        while(l1 != null || l2 != null || c != 0){
            sum = c;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            c = sum / 10;
            ans.next = new ListNode(sum % 10);
            ans = ans.next;
        }
        return dummy.next;
    }
}