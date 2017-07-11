/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode top = head;
        ListNode currentNode = head;
        ListNode skipNode = head;
   
        // edge case of head is n from the end
        if (n == 1 && head.next == null) {
            return null;
        }
        // Initialize
		for (int i = 0; i < n; i++) {
                skipNode = skipNode.next; 
        }
        
		// edge case of head is n from the end
        if (skipNode == null) {
            return head.next;
        }
        
        while (skipNode.next != null) {
            // Iterate once
            currentNode = currentNode.next;
            skipNode = skipNode.next;
        }
        
        // We hit the end. 
        currentNode.next = currentNode.next.next;
        return top;
        
    }
}
