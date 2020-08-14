//https://leetcode.com/problems/squares-of-a-sorted-array/
fun sortedSquares(A: IntArray) = A.map { it * it }.sorted().toIntArray()


