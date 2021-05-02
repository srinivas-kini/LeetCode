# https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/
digit_dict = {
    "2": ["a", "b", "c"],
    "3": ["d", "e", "f"],
    "4": ["g", "h", "i"],
    "5": ["j", "k", "l"],
    "6": ["m", "n", "o"],
    "7": ["p", "q", "r", "s"],
    "8": ["t", "u", "v"],
    "9": ["w", "x", "y", "z"],
}


class Solution:
    def letterCombinations(self, digits):

        if len(digits) == 0:
            return []
        if len(digits) == 1:
            return digit_dict[digits]
        dp = digit_dict[digits[0]]
        for i in range(1, len(digits)):
            dp = self._combine_pairs(dp, digit_dict[digits[i]])
        return dp

    def _combine_pairs(self, list1, list2):
        return [(l1 + l2) for l1 in list1 for l2 in list2]
