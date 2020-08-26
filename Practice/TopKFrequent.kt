package practice_problems
//https://leetcode.com/problems/top-k-frequent-elements/
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val res = mutableListOf<Int>()
    nums.groupBy { it }.values.sortedByDescending { it.size }.take(k).forEach {
        res.add(it[0])
    }
    return res.toIntArray()
}

