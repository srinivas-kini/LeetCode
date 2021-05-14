# https://leetcode.com/problems/shifting-letters/
class Solution(object):
    letters = 'abcdefghijklmnopqrstuvwxyz'
    def shiftingLetters(self, s, shifts):
        shifted = ""
        for i in range(len(s)):
            shifted = self.shift(to_shift=shifted + s[i], by=shifts[i])
        return shifted

    def shift(self, to_shift, by):
        return "".join(self.letters[(self.letters.index(c) + by) % 26] for c in to_shift)
