//https://leetcode.com/problems/reverse-words-in-a-string-iii/
fun reverseWords(s: String): String {
    var res = ""
    s.replace("//s+".toRegex(), " ").split(" ").forEach { word ->

        res += word.reversed()
        res += " "
    }
    return res.trim()
}
