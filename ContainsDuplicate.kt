fun containsDuplicate(nums: IntArray): Boolean {
    var set = mutableSetOf<Int>()
    nums.forEach { num ->
        if (set.contains(num)) return true
        set.add(num)
    }
    return false
}
