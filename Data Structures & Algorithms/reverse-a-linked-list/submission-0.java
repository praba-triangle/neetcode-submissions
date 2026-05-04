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
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> list = new ArrayList();

        ListNode temp = head;
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        Collections.reverse(list);

        ListNode resultListNode = new ListNode(0);
        ListNode tempResultListNode = resultListNode;

        for(int num : list) {
            ListNode curr = new ListNode(num);
            tempResultListNode.next = curr;
            tempResultListNode = tempResultListNode.next;
        }

        return resultListNode.next;
        
    }
}
