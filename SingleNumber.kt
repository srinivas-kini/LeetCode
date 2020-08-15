//https://leetcode.com/problems/single-number/
fun singleNumber(nums: IntArray): Int {

    var mem = mutableMapOf<Int, Int>()
    nums.forEach { ele ->
        var value = mem[ele]?.plus(1) ?: 1
        mem[ele] = value
    }

    return mem.keys.filter { mem[it] == 1 }[0]
}

