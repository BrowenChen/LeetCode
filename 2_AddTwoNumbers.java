/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carryDigit = 0;
        int val1 = l1.val;
        int val2 = l2.val;
        
        ListNode prev = new ListNode(0);
        ListNode firstNode;
        
        if (val1 + val2 < 10) {
            firstNode = new ListNode(val1+val2);
        } else {
            carryDigit += 1;
            firstNode = new ListNode((val1+val2)%10);
        }
        
        ListNode head = prev;
        head.next = firstNode;
        ListNode curNode = firstNode;
        ListNode nextNode;

        
        while (l1.next != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
            int nextDigit = l1.val + l2.val + carryDigit;
            if (carryDigit > 0) {
                carryDigit = 0;
            }
            if (nextDigit < 10) {
                nextNode = new ListNode(nextDigit);
            } else {
                carryDigit += 1;
                nextNode = new ListNode(nextDigit%10);   
            }
            curNode.next = nextNode;
            curNode = nextNode;
        }
        
        // One of the two are empty
        if (carryDigit == 0) {
            if (l1.next != null) {
                while (l1.next != null) {
                    l1 = l1.next;
                    nextNode = new ListNode(l1.val);
                    curNode.next = nextNode;
                    curNode = nextNode;
                }
            } else if (l2.next != null) {
                while (l2.next != null) {
                    l2 = l2.next;
                    nextNode = new ListNode(l2.val);
                    curNode.next = nextNode;
                    curNode = nextNode;
                }                
            } else {
                if (carryDigit > 0) {
                    nextNode = new ListNode(1);
                    curNode.next = nextNode;
                    curNode = nextNode;
                }                
                return head.next;
            }
        } else {
            if (l1.next != null) {
                while (l1.next != null) {
                    l1 = l1.next;
                    if (carryDigit > 0) {
                        nextNode = new ListNode((l1.val+1)%10);  
                        carryDigit = l1.val + 1 < 10 ? 0 : 1; 
                    } else {
                        nextNode = new ListNode((l1.val));  
                    }
                    curNode.next = nextNode;
                    curNode = nextNode;
                }
            } else if (l2.next != null) {
                while (l2.next != null) {
                    l2 = l2.next;
                    if (carryDigit > 0) {                 
                        nextNode = new ListNode((l2.val+1)%10);
                        carryDigit = l2.val + 1 < 10 ? 0 : 1;           
                    } else {
                        nextNode = new ListNode((l2.val));  
                    }                   
                    curNode.next = nextNode;
                    curNode = nextNode;
                }                
            }            
        }
        
        if (carryDigit > 0) {
            nextNode = new ListNode(1);
            curNode.next = nextNode;
            curNode = nextNode;
        }
        
        return head.next;
    }
}
