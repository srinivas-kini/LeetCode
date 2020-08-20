//https://leetcode.com/problems/find-all-duplicates-in-an-array/
fun findDuplicates(nums: IntArray): List<Int> {

    var mp = mutableMapOf<Int, Int>()
    nums.forEach { num ->
        var value = mp[num]?.plus(1) ?: 1
        mp[num] = value
    }
    return mp.filterValues { it >= 2 }.keys.toList()
}
