//https://leetcode.com/problems/sort-array-by-parity-ii/
fun sortArrayByParityII(A: IntArray): IntArray {
    val eveArr = IntArray(A.size / 2)
    val oddArr = IntArray(A.size / 2)
    val res = IntArray(A.size)
    var i = 0
    var j = 0
    var k = 0

    while (k in A.indices) {
        if (A[k] % 2 == 0) {
            eveArr[i] = A[k]
            i++
        } else {
            oddArr[j] = A[k]
            j++
        }
        k++
    }

    i = 0
    j = 0
    k = 0

    while (k in res.indices) {
        if (k % 2 == 0) {
            res[k] = eveArr[i]
            i++
        } else {
            res[k] = oddArr[j]
            j++
        }
        k++
    }
    return res
}

