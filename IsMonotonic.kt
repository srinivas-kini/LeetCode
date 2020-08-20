//https://leetcode.com/problems/monotonic-array/
fun isMonotonic(A: IntArray): Boolean {
    var i = 0
    var j = 1
    var k = 0
    while (j in A.indices) {
        if (A[j] - A[i] != 0) {
            k = A[j] - A[i]
            break
        }
        i++
        j++
    }
    if (k < 0) {
        while (j in A.indices) {
            if (A[j] - A[i] > 0) return false
            i++
            j++
        }
    } else if (k > 0) {
        while (j in A.indices) {
            if (A[j] - A[i] < 0) return false
            i++
            j++
        }
    }
    return true
}

