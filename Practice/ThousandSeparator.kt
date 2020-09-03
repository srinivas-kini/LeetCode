fun thousandSeparator(n: Int): String {

    if (n <= 999) return n.toString()

    val sb = StringBuilder(n.toString())
    val ln = sb.length
    for (i in ln - 3 downTo 0 step 3) {
        if (i != 0)
            sb.insert(i, '.')
    }
    return sb.toString()
}

