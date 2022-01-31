# https://leetcode.com/problems/find-k-closest-elements/
class Solution:
    def findClosestElements(self, arr: List[int], k: int, x: int) -> List[int]:
        
        heap = []
        heapify(heap)
        
        for a in arr:
            if len(heap) < k:
                heappush(heap,(-abs(a-x),a))
            else:
                currdiff = abs(a-x)
                prev_diff, b = heap[0]
                prev_diff = -1 * prev_diff
                
                if (prev_diff == currdiff and a <= b) or currdiff < prev_diff:
                    heapq.heappop(heap)
                    heappush(heap,(-currdiff,a))
                
            
        return sorted([h[1] for h in heap])
        
        

        
