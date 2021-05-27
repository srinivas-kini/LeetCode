// https://leetcode.com/problems/shortest-distance-to-a-character/
import kotlin.math.abs

class Solution {
    fun shortestToChar(s: String, c: Char): IntArray {
        if (s.length == 1) return intArrayOf(0)
        val cIndices = mutableListOf<Int>()
        val result = mutableListOf<Int>()
        s.forEachIndexed { index, ch -> if (ch == c) cIndices.add(index) }
        for (i in s.indices) {
            var min = Int.MAX_VALUE
            for (j in cIndices.indices) {
                min = minOf(min, abs(cIndices[j] - i))
            }
            result.add(min)
        }

        return result.toIntArray()
    }
}
