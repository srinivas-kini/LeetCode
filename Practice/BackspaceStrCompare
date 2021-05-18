// https://leetcode.com/problems/backspace-string-compare/submissions/
import java.util.*
class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        val sStack = Stack<Char>()
        val tStack = Stack<Char>()
        s.forEach { char ->
            if (!sStack.empty()) {
                if (char == '#') sStack.pop() else sStack.push(char)
            } else {
                sStack.push(char)
            }
        }

        t.forEach { char ->
            if (!tStack.empty()) {
                if (char == '#') tStack.pop() else tStack.push(char)
            } else {
                tStack.push(char)
            }
        }
        return (tStack.filter { it != '#' } == sStack.filter { it != '#' })
    }
}
