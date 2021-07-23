# https://leetcode.com/problems/odd-even-linked-list/
class Solution:
    def oddEvenList(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        
        odd_head = None
        eve_head = None
        curr = head
        odds = None
        eves = None
        idx = 1
        while curr:
            if idx % 2 == 0:
                if not eve_head:
                    eve_head = curr
                    eves = curr
                else:
                    eves.next = curr
                    eves = eves.next
            else:
                if not odd_head:
                    odd_head = curr
                    odds = curr
                else:
                    odds.next = curr
                    odds = odds.next
            idx += 1
            curr = curr.next
        
        odds.next = eve_head
        eves.next = None
        
        return odd_head
        
