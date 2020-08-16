//https://leetcode.com/problems/goat-latin/
fun toGoatLatin(S: String): String {
    var res = ""
    var a = "a"
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    val words = S.split(" ")
    var tmp = ""
    words.forEach { word ->
        tmp = word
        if (tmp[0] in vowels) {
            tmp += "ma$a"
            a += "a"
            res += "$tmp "
        } else {
            var tmp1 = tmp + tmp[0]
            var tmp2 = tmp1.replaceFirst(tmp[0].toString(), "")
            tmp2 += "ma$a"
            a += "a"
            res += "$tmp2 "
        }
    }
    return res.trim()
}
