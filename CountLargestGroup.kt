//https://leetcode.com/problems/count-largest-group/
fun countLargestGroup(n: Int): Int {
    var res = 0
    val mp = mutableMapOf<Int, MutableList<Int>>()

    for (i in 1..n) {
        val digitSum = getSumOfDigits(i)
        if (!mp.containsKey(digitSum))
            mp[digitSum] = mutableListOf(i)
        else
            mp[digitSum]?.add(i)

    }
    val mxCount = mp.values.maxBy { it.size }?.count() ?: 1
    mp.values.forEach {
        if (it.size == mxCount)
            res++
    }
    return res
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


