//https://leetcode.com/problems/next-greater-element-i/
fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {

    val res = mutableListOf<Int>()
    var i = 0
    var index = 0

    while (i in nums1.indices) {
        val curr = nums1[i]
        index = nums2.indexOf(curr)
        if (index != -1) {
            if (index == nums2.size - 1)
                res.add(-1)
            else {
                for (k in index until nums2.size) {
                    if (nums2[k] > curr) {
                        res.add(nums2[k])
                        break
                    }
                    if (k == nums2.size - 1) res.add(-1)
                }
            }
        }
        i++
    }

    return res.toIntArray()
}

