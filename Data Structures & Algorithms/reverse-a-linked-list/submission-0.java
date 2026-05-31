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
        if(head == null){
            return null;
        }
        Stack<ListNode> stac = new Stack<>();

        ListNode curr = head;
        while(curr != null){
            stac.push(curr);
            curr = curr.next;
        }

        ListNode newHead = stac.pop();
        ListNode cur = newHead;
        int size = stac.size();
        for(int i = 0; i < size; i ++){
            cur.next = stac.pop();

            cur = cur.next;
        }

        cur.next = null;


        return newHead;
    }
}
