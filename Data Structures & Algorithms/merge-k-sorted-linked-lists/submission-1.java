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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        ListNode merged = lists[0];
        for(int i =1; i<lists.length; i++){
            merged = merge(merged, lists[i]);
        }

        return merged;
    }

    private ListNode merge(ListNode l1, ListNode l2){
        ListNode res = new ListNode(-1);
        ListNode temp = res;
        while(l1!= null && l2 != null){
            if(l1.val < l2.val){
                res.next = l1;
                l1 = l1.next;
                
            }else{
                res.next = l2;
                l2 = l2.next;
            }
            res = res.next;
       }
       res.next = l1 == null ? l2 : l1;
       return temp.next;
    }
}
