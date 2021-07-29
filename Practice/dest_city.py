# https://leetcode.com/problems/destination-city/
class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        start_idx = 0
        dest_city = ''
        while start_idx < len(paths):
            end = paths[start_idx][1]
            found = False
            for i in range(0,len(paths)):
                if paths[i][0] == end:
                    found = True
                    break
            if not found:
                dest_city = end                
            start_idx += 1
        return dest_city
        
