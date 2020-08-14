//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
fun countNegatives(grid: Array<IntArray>): Int {
    var res = 0
    grid.forEach { row -> row.forEach { if(it<0) res++ } }
    return res
}

