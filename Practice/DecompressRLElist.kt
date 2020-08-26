//https://leetcode.com/problems/decompress-run-length-encoded-list/
fun decompressRLElist(nums: IntArray): IntArray {

    val res = mutableListOf<Int>()
    val frequencies = IntArray(nums.size / 2)
    val values = IntArray(nums.size / 2)

    var i = 0
    var j = 0
    var k = 0

    while (k in nums.indices) {
        if (k % 2 == 0) {
            frequencies[i] = nums[k]
            i++
        } else {
            values[j] = nums[k]
            j++
        }
        k++
    }

    var ct = 0
    frequencies.forEach { f ->
        for (i in 1..f)
            res.add(values[ct])
        ct++
    }
    return res.toIntArray()
}

