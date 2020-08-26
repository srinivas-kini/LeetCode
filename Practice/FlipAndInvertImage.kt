//https://leetcode.com/problems/flipping-an-image/
fun flipAndInvertImage(A: Array<IntArray>): Array<IntArray> {
    var res: Array<IntArray> = A

    for (i in A.indices) {
        var intArray = A[i]
        val n = intArray.size
        var tmpArray = IntArray(n)
        for (j in 0 until n) {
            tmpArray[j] = intArray[n - j - 1]
            tmpArray[j] = if (tmpArray[j] == 1) 0 else 1
        }
        res[i] = tmpArray
    }
    return res
}