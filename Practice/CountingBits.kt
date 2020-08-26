fun countBits(num: Int): IntArray {
    var res = IntArray(num + 1)
    for (i in 0..num)
        res[i] = getOneBits(i)
    return res
}

fun getOneBits(n: Int): Int {
    var num = n
    var oneCount = 0
    while (num > 0) {
        oneCount = if (num and 1 == 0) oneCount else ++oneCount
        num = num shr 1
    }
    return oneCount.also(::println)
}

fun main() {

}