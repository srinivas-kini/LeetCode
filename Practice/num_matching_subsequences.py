# https://leetcode.com/problems/number-of-matching-subsequences/
class Solution:
    def numMatchingSubseq(self, s: str, words: List[str]) -> int:
        memo = set()
        ignore = set()
        def is_sub(word):
            i = 0 
            curr_char = word[i]
            for c in s:
                if c == curr_char:
                    if i == len(word)-1:
                        return True
                    else:
                        i += 1
                        curr_char = word[i]
            return False
        count = 0
        for word in words:
            if word in memo:
                count +=1
            elif word not in ignore:
                if is_sub(word):
                    memo.add(word)
                    count +=1
                else:
                    ignore.add(word)                
        return count
