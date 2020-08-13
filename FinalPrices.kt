//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
fun finalPrices(prices: IntArray): IntArray {
    
    var res = IntArray(prices.size)
    
    for (i in prices.indices) {
        
        var curr = prices[i]
        var j = i + 1

        if (j == prices.size) {
            res[i] = prices[i]
            break
        }

        while (j < prices.size) {
            if (prices[j] <= curr) {
                res[i] = curr - prices[j]
                break
            } else {
                res[i] = prices[i]
                j++
            }
        }
    }
    return res
}
