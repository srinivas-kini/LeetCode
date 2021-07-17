# https://leetcode.com/problems/remove-nth-node-from-end-of-list/
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if not head:
            return None
    
        del_node_idx = self.get_len(head) - n 
        if del_node_idx == 0:
            head = head.next
            return head
        
        count = 0
        curr = head
        while True:
            count +=1
            if count == del_node_idx:
                curr.next = curr.next.next
                break
            curr = curr.next
        return head
            
    def get_len(self,head: ListNode) -> int:
        curr = head
        count = 0
        while curr:
            count +=1
            curr = curr.next
        return count 
