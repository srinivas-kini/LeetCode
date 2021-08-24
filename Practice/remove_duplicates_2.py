# https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head              
        
        seen = set()
        curr = head
        nodes = []
        while curr:
            if curr.val in seen:
                for node in nodes:
                    if node.val == curr.val:
                        nodes.remove(node)
            else:
                seen.add(curr.val)
                nodes.append(curr)
            curr = curr.next
        if not nodes:
            return None
                
        for i in range(len(nodes)-1):
            nodes[i].next = nodes[i+1]
        
        nodes[-1].next = None
        return nodes[0]
