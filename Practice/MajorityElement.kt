//https://leetcode.com/problems/majority-element/
fun majorityElement(nums: IntArray): Int {
    val mem = mutableMapOf<Int, Int>()
    nums.forEach { ele ->
        var value = mem[ele]?.plus(1) ?: 1
        mem[ele] = value
    }
    return mem.filterValues { it > nums.size / 2 }.keys.toList()[0]
}