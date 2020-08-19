//https://leetcode.com/problems/reformat-the-string/
fun reformat(s: String): String {

    if (s.length == 1) return s
    val digitRegex = "[0-9]".toRegex()
    val digits = mutableListOf<String>()
    val letters = mutableListOf<String>()
    var res = ""

    s.forEach { char ->
        if (char.toString().matches(digitRegex)) digits.add(char.toString())
        else letters.add(char.toString())
    }

    var count = s.length
    var i = 0
    var j = 0
    while (count > 0 && !(letters.isEmpty() || digits.isEmpty())) {

        if (letters.size > digits.size) {
            if (count % 2 != 0) {
                res += letters[i]
                i++
            } else {
                res += digits[j]
                j++
            }
        } else {
            if (count % 2 != 0) {
                res += digits[j]
                j++
            } else {
                res += letters[i]
                i++
            }
        }
        count--
    }

    return res
}

