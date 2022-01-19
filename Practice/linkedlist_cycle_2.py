# https://leetcode.com/problems/linked-list-cycle-ii/
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        if not head:
            return None
        
        seen_nodes = set()
        curr = head
        idx = 0
        
        while curr:
            if curr in seen_nodes:
                return curr
            seen_nodes.add(curr)
            curr = curr.next
            idx += 1
        
        return None
        
