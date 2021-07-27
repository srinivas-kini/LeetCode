# https://leetcode.com/problems/group-anagrams/
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = {}
        for s in strs:
            val = tuple(sorted(s))
            if val in groups:
                groups[val].append(s)
            else:
                groups[val] = [s]
        return groups.values()
