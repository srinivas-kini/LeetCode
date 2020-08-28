//https://leetcode.com/problems/simplified-fractions/
fun simplifiedFractions(n: Int): List<String> {

    if (n <= 1) return emptyList()

    val res = mutableListOf<String>()
    val s = mutableListOf<Double>()
    var denominator = 2

    while (denominator <= n) {
        for (i in 1..denominator) {
            if (i == 1 && i != denominator)
                res.add("$i/$denominator")
            else if (denominator % i != 0 && !s.contains(i.toDouble() / denominator.toDouble()))
                res.add("$i/$denominator")
            s.add((i.toDouble() / denominator.toDouble()))
        }
        denominator++
    }
    return res
}


