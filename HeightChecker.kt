//https://leetcode.com/problems/height-checker/
fun heightChecker(heights: IntArray): Int {
    var res = 0
    var sortedHeights = heights.sorted()
    for (i in heights.indices)
        if (sortedHeights[i] != heights[i])
            res++
    return res
}

