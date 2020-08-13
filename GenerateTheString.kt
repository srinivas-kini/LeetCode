//https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
fun generateTheString(n: Int): String {

    return if(n%2 == 1)
        sequenceOf('a').repeat().take(n).joinToString("")
    else {
        var s1 = sequenceOf('a').repeat().take(n-1).joinToString("")
        "${s1}b"
    }
}

fun <T> Sequence<T>.repeat() = sequence { while (true) yieldAll(this@repeat) }
