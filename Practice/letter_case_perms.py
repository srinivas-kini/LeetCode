# https://leetcode.com/problems/letter-case-permutation/submissions/
class Solution(object):
    def letterCasePermutation(self, s):
        import itertools
        return list(set(map("".join, itertools.product(*zip(s.upper(), s.lower())))))
        
