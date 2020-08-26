//https://leetcode.com/problems/peak-index-in-a-mountain-array/
fun peakIndexInMountainArray(A: IntArray): Int {
    var mx = A.max()
    for (i in A.indices) {
        if (A[i] == mx)
            return i
    }
    return -1
}