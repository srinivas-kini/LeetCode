# https://leetcode.com/problems/reverse-linked-list/
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        
        prev,curr,nxt = None,head,None
        
        while curr:
            nxt = curr.next
            curr.next = prev
            prev = curr
            curr = nxt
        head = prev
        return head
