# https://leetcode.com/problems/implement-strstr/
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        return (-1 if needle not in haystack 
                else 0 if needle=='' 
                else haystack.index(needle))
