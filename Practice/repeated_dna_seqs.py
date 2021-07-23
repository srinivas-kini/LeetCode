# https://leetcode.com/problems/repeated-dna-sequences/
class Solution:
    def findRepeatedDnaSequences(self, s: str) -> List[str]:
        mp = {}
        
        for i in range(len(s)-9):
            dna = s[i:i+10]
            if dna in mp: mp[dna] +=1
            else: mp[dna] = 1 
        
        return [k for k,v in mp.items() if v >=2]
