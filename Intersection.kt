//https://leetcode.com/problems/intersection-of-two-arrays/
fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val res = mutableSetOf<Int>()
    res.addAll(nums1.filter { it in nums2 })
    return res.toIntArray()
}

