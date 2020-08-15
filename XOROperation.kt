//https://leetcode.com/problems/xor-operation-in-an-array/
fun xorOperation(n: Int, start: Int): Int {
    var arr = IntArray(n) { start + 2 * it }
    return arr.xor()
}

fun IntArray.xor(): Int {
    var xorSum = 0
    for (i in this.indices)
        xorSum = xorSum xor this[i]
    return xorSum
}


