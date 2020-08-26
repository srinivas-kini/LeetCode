//https://leetcode.com/problems/count-largest-group/
fun countLargestGroup(n: Int): Int {
    val mp = mutableMapOf<Int, MutableList<Int>>()

    for (i in 1..n) {
        var digitSum = getSumOfDigits(i)
        if (!mp.containsKey(digitSum))
            mp[digitSum] = mutableListOf(i)
        else
            mp[digitSum]?.add(i)

    }
    val mxCount = mp.values.maxBy { it.size }?.count() ?: 1
    return mp.values.filter { it.size == mxCount }.count()
}

fun getSumOfDigits(i: Int): Int {
    var num = i
    var sumOfDigits = 0
    while (num > 0) {
        var digit = num % 10
        sumOfDigits += digit
        num /= 10
    }
    return sumOfDigits
}

