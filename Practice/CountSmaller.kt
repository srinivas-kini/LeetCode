//https://leetcode.com/problems/count-of-smaller-numbers-after-self/
fun countSmaller(nums: IntArray): List<Int> {
    var res = IntArray(nums.size)
    var i = 0
    var j = 1
    while (i < nums.size) {
        var curr = nums[i]
        var count = 0
        for (k in j until nums.size) {
            if (nums[k] < curr)
                count++
            res[i] = count
        }
        i++
        j++
    }
    return res.toList()
}