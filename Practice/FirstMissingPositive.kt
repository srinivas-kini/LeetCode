fun firstMissingPositive(nums: IntArray): Int {

    val positives = nums.filter { it > 0 }.sorted().distinct()
    val arr = IntArray(positives.size) { it + 1 }

    for (i in positives.indices)
        if (positives[i] != arr[i])
            return arr[i]
    return arr.size + 1
}

