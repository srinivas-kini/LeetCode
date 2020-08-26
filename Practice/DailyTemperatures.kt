//https://leetcode.com/problems/daily-temperatures/
fun dailyTemperatures(T: IntArray): IntArray {
    var res = IntArray(T.size)

    var i = 0
    while (i in T.indices) {
        var curr = T[i]
        for (j in i + 1 until T.size) {
            if (T[j] > curr) {
                res[i] = j - i
                break
            }
            if (j == T.size - 1) res[i] = 0
        }
        i++
    }
    return res
}

