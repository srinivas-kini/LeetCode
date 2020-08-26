//https://leetcode.com/problems/shuffle-string/
fun restoreString(s: String, arr: IntArray): String {
    var res = CharArray(arr.size)
    for (i in arr.indices) {
        res[arr[i]] = s[i]
    }
    return res.joinToString("")
}

