class MyHashMap() {

    /** Initialize your data structure here. */
    var maxSize = 1000001
    var hashArr = Array(maxSize) { -1 }

    init {
        this.maxSize = maxSize
        this.hashArr = hashArr
    }

    /** value will always be non-negative. */
    fun put(key: Int, value: Int) {
        this.hashArr[hash(key)] = value
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    fun get(key: Int): Int {
        return this.hashArr[hash(key)] ?: -1
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    fun remove(key: Int) {
        this.hashArr[hash(key)] = -1
    }

    private fun hash(key: Int): Int = key % this.maxSize

}
