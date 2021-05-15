# https://leetcode.com/problems/shifting-letters/
class Solution(object):
    letters = "abcdefghijklmnopqrstuvwxyz"

    def shiftingLetters(self, s, shifts):
        shifted = ""
        _sum = sum(shifts)
        for i in range(len(s)):
            shifted += self.shift(to_shift=s[i], by=_sum)
            _sum -= shifts[i]
        return shifted

    def shift(self, to_shift, by):
        return self.letters[(self.letters.index(to_shift) + by) % 26]

