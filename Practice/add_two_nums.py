# https://leetcode.com/problems/add-two-numbers/
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        
        
        curr1, curr2 = l1, l2
        new_list = ListNode()
        new_head = new_list
        carry = 0 
        
        while curr1 or curr2:
            if curr1 and curr2:
                new_val = (curr1.val + curr2.val + carry) 
                carry = new_val // 10
                new_val %= 10 
                curr1 = curr1.next
                curr2 = curr2.next
            
            elif curr1 and (not curr2):
                new_val = (curr1.val + carry) 
                carry = new_val // 10
                new_val %= 10 
                curr1 = curr1.next
            
            elif curr2 and (not curr1):
                new_val = (curr2.val + carry) 
                carry = new_val // 10
                new_val %= 10 
                curr2 = curr2.next
            
            new_list.next = ListNode(new_val)
            new_list = new_list.next
            
            print(new_val, carry)
            
        if carry:
            new_list.next = ListNode(carry)

        return new_head.next
