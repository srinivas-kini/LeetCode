# https://leetcode.com/problems/sorting-the-sentence/
class Solution(object):
    def sortSentence(self, s):
        res = ""
        for word in sorted(s.split(), key=lambda x: int(x[-1])):
            word = word[:- 1]
            res += word + " "
        return res.strip()
