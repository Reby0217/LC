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
        ListNode start = new ListNode(-1), dupStart = start;
        ListNode p1 = list1;
        ListNode p2 = list2;
        while (p1 != null && p2 !=null) {
            if (p1.val > p2.val) {
                start.next = p2;
                p2 = p2.next;
            } else {
                start.next = p1;
                p1 = p1.next;
            }
            start = start.next;
        }
        if (p1 == null) {
            start.next = p2;
        }
        if (p2 == null) {
            start.next = p1;
        }
        return dupStart.next;
    }
}