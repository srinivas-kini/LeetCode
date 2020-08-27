//https://leetcode.com/problems/bulb-switcher-iii/
fun numTimesAllBlue(light: IntArray): Int {
    var dp = 0
    var moments = 0
    light.forEachIndexed { index, bulbNo ->
        dp = maxOf(dp, bulbNo)
        if (index + 1 == dp)
            moments++
    }

    return moments
}
