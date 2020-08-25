package practice_problems
//https://leetcode.com/problems/rotate-string/
fun rotateString(A: String, B: String): Boolean {

    if (A == B) return true
    if (A.length != B.length) return false

    var i = 0
    var a = A
    var currCharIndex = 0

    while (i in a.indices) {
        a += A[currCharIndex]
        a = a.replaceFirst(a[0].toString(), "")
        if (a == B) return true
        currCharIndex++
        i++
    }
    return false
}

