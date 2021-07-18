class Solution:
    def deleteDuplicates(self, head: ListNode) -> ListNode:
        if not head:
            return None
        if not head.next:
            return head
        return self.del_dups(head)
    
    def del_dups(self,head: ListNode) -> ListNode:
        if not head or not head.next:
            return
        if head.val == head.next.val:
            head.next = head.next.next
            self.del_dups(head)
        self.del_dups(head.next)
        return head
        
