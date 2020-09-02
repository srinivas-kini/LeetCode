//https://leetcode.com/problems/kth-missing-positive-number/
fun findKthPositive(arr: IntArray, k: Int): Int {
    val missingNums = sortedSetOf<Int>()
    if (arr[0] != 1) {
        missingNums.addAll(
            generateSequence(1) { it + 1 }.take(arr[0] - 1)
        )
    }
    for (i in 1 until arr.size) {
        if (arr[i] - arr[i - 1] > 1) {
            missingNums.addAll(
                generateSequence(arr[i - 1] + 1) { it + 1 }.take(arr[i] - arr[i - 1] - 1)
            )
        }
    }
    missingNums.addAll(
        generateSequence(arr.max()!! + 1) { it + 1 }.take(k)
    )
    return missingNums.toList()[k - 1]
}
