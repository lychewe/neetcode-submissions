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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode combined = dummy;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                combined.next = list1;
                list1 = list1.next;
                combined = combined.next;
            }
            else {
                combined.next = list2;
                list2 = list2.next;
                combined = combined.next;
            }
        }
        if(list1 != null) {
            combined.next = list1;
        }
        else {
            combined.next = list2;
        }
        return dummy.next;
    }
}