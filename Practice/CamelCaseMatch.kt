//https://leetcode.com/problems/camelcase-matching/
class Solution {
    fun camelMatch(queries: Array<String>, pattern: String): List<Boolean> {
        var matchList = mutableListOf<Boolean>()
        var pattern_ = ""
        for (c in pattern) {
            pattern_ += "[a-z]*$c[a-z]*"
        }
        pattern_ = "^$pattern_$"
        queries.forEach { matchList.add(it.matches(pattern_.toRegex())) }
        return matchList
    }
}
