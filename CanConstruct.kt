package practice_problems
//https://leetcode.com/problems/ransom-note/
fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val ls = magazine.toMutableList()
    var r = 0
    var res = ""
    while (r in ransomNote.indices) {
        for (i in ls.indices) {
            if (ls[i] == ransomNote[r]) {
                res += ls[i]
                ls[i] = '0'
                break
            }
        }
        r++
    }
    return res == ransomNote
}

fun main() {
    canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj").also(::println)
}

