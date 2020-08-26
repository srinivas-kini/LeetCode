//https://leetcode.com/problems/print-words-vertically/
fun printVertically(s: String): List<String> {
    val res = mutableListOf<String>()
    val words = s.split(" ")
    var wordIndex = 0
    var i = 0

    while (i in s.indices) {
        var resWord = ""
        for (j in words.indices) {
            resWord += if (words[j].length >= wordIndex + 1) {
                words[j][wordIndex].toString()
            } else " "
        }
        if (resWord.trimEnd() != "")
            res.add(resWord.trimEnd())
        wordIndex++
        i++
    }
    return res
}
