# https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        
        res = []
        heap = []
        heapify(heap)
        
        for num in arr:
            ones = str(format(num,'b')).count('1')
            if not ones:
                ones = 0
            # print(ones,num)
            heappush(heap,(ones,num))
        
        while len(heap) >= 1:
            
            if len(heap) > 1:
                ct1,e1 = heappop(heap)
                ct2, e2 = heappop(heap)
                
                if (ct1 == ct2 and e1 <= e2) or ct1 < ct2:
                    res.append(e1)
                    res.append(e2)
                else:
                    res.append(e2)
                    res.append(e1)
                
            else:
                res.append(heappop(heap)[1])
                
        # print(heap)
        # print(res)
        return res
                
