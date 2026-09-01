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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = getLength(head);
        int pos = size - n;
        if(pos==0) return head.next;
        ListNode temp = head;
        while(pos>1){
            temp = temp.next;
            pos--; 
        }
        temp.next = temp.next.next;
        return head;
        
    }

    private int getLength(ListNode head){
        int size = 0;
        while(head!=null){
            size++;
            head = head.next;
        }
        return size;
    }
}
