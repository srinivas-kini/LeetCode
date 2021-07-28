# https://leetcode.com/problems/consecutive-characters/
class Solution:
    def maxPower(self, s: str) -> int:
        last_char = s[0]
        tmp_power = 1
        power = 1
        for i in range(1,len(s)):
            if s[i] == last_char:
                tmp_power +=1
            else:
                last_char = s[i]
                power = max(power,tmp_power)
                tmp_power = 1
        power = max(power,tmp_power)
        return power
