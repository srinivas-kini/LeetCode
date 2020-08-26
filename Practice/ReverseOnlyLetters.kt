//https://leetcode.com/problems/reverse-only-letters/
import kotlin.text.StringBuilder
fun reverseOnlyLetters(S: String): String {
    val mp = mutableListOf<Pair<String, Int>>()
    var res = StringBuilder()
    S.forEachIndexed { index, char ->
        if (!char.toString().matches("[a-z]|[A-Z]".toRegex()))
            mp.add(Pair(char.toString(), index))
        else res.append(char)
    }
    res = res.reverse()
    mp.forEach { pair ->
        res.insert(pair.second, pair.first)
    }

    return res.toString()
}


