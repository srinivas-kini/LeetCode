# https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/
class Solution:
    def reverseParentheses(self, s: str) -> str:
        
        if len(s) ==1:
            return s
        
        stack = []
        
        for c in s:
            if c != ')':
                stack.append(c)
            else:
                tmp = ""
                while stack[-1] != '(':
                    tmp += stack.pop()
                stack.pop()
                stack.extend([c for c in tmp])
        
        return ''.join(stack)
        
        
                
