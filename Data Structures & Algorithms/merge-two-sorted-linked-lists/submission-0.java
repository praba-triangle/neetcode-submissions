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
        ListNode tempList1 = list1;
        ListNode tempList2 = list2;

        List<Integer> list = new ArrayList<>();
        while (tempList1 != null) {
            list.add(tempList1.val);
            tempList1 = tempList1.next;
        }

        while (tempList2 != null) {
            list.add(tempList2.val);
            tempList2 = tempList2.next;
        }

        Collections.sort(list);
        ListNode resultNode = new ListNode(0);
        ListNode tempResultNode = resultNode;

        for (int num : list) {
            ListNode currListNode = new ListNode(num);
            tempResultNode.next = currListNode;
            tempResultNode = tempResultNode.next;
        }

        return resultNode.next;
    }
}