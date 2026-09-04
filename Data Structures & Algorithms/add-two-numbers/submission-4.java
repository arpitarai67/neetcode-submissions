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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode dummy = res;
        if(l1 == null ) return l2;
        if(l2 == null) return l1;
        int carry = 0;
        while(l1!= null && l2!=null){
            int sum = l1.val + l2.val+ carry;
            if(sum >= 10){
                carry = 1;
                sum%=10;
            }else{
                carry = 0;
            }
            res.next = new ListNode(sum);
            res = res.next;
            l1 = l1.next;
            l2 = l2.next;        
        }

        while(l1!= null){
            if(carry!=0){
                l1.val += carry;
                carry = 0;
            }
            res.next = new ListNode(l1.val%10);
            if(l1.val >= 10) carry = 1;
            res = res.next;
            l1 = l1.next;
        }
        if(carry!=0){
            res.next = new ListNode(carry);
        }
        while(l2!= null){
            if(carry!=0){
                l2.val += carry;
                carry = 0;
            }
            res.next = new ListNode(l2.val%10);
            if(l2.val >= 10) carry = 1;
            res = res.next;
            l2 = l2.next;
        }
        if(carry!=0){
            res.next = new ListNode(carry);
        }
       

        return dummy.next;
    }
}
