/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class add_two_numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // Initialize a new ListNode to store the result
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        
        // Loop through both lists until they are both null
        while (l1 != null || l2 != null) {
            
            // Get the values of the current nodes (or 0 if null)
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            
            // Calculate the sum and carry
            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            
            // Move to the next nodes (or null if end of list)
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            current = current.next;
        }
        
        // Check if there's still a carry
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        // Return the result (excluding the initial 0)
        return dummy.next;
    }

    
}
