//https://leetcode.com/problems/insert-delete-getrandom-o1/
class RandomizedSet() {

    companion object

    var randomMap = mutableMapOf<Int, Int>()

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    fun insert(value: Int): Boolean {
        if (randomMap.containsKey(value))
            return false
        randomMap[value] = value
        return true
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    fun remove(value: Int): Boolean {
        if (randomMap.containsKey(value)) {
            randomMap.remove(value)
            return true
        }
        return false
    }

    /** Get a random element from the set. */
    fun getRandom(): Int {
        return randomMap.values.random()
    }

}