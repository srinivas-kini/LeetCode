//https://leetcode.com/problems/reverse-words-in-a-string/
fun reverseWords(s: String): String {

    var lst = s.replace("\\s+".toRegex(), " ").split(" ")
    var res = ""

    for (i in lst.indices)
        res += lst[lst.size - i - 1] + " "

    return res.trim()
}
