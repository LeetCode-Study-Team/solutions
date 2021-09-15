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
        ListNode cur = head;
        ListNode answer = null;
                
        while(cur != null){
            ListNode curNode = new ListNode(cur.val, answer);
            answer = curNode;
            
            cur = cur.next;
        }
        return answer;
    }
}
