# https://leetcode.com/problems/find-common-characters/
import math


class Solution:
    def commonChars(self, words):
        if len(words) == 1:
            return [char for char in words[0]]

        op = []
        s = set(words[0])
        for i in range(1, len(words)):
            s = s.intersection(words[i])

        for char in s:
            min_count = math.inf
            for word in words:
                min_count = min(min_count, word.count(char))
            op.extend([char for _ in range(min_count)])

        return op 
