//https://leetcode.com/problems/sort-an-array/
fun sortArray(nums: IntArray): IntArray {
    if (nums.count() < 2) return nums
    val pivot = nums[nums.count() / 2]
    val equals = nums.filter { it == pivot }.toIntArray()
    val lesser = nums.filter { it < pivot }.toIntArray()
    val greater = nums.filter { it > pivot }.toIntArray()
    return sortArray(lesser) + equals + sortArray(greater)
}

