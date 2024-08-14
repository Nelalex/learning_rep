

fun main() {
    println(maxProfit(intArrayOf(1,2,3)))

}


fun maxProfit(prices: IntArray): Int {
    if (prices.isEmpty()) return 0

    var minPrice = prices[0]
    var maxProfit = 0

    for (i in 1 until prices.size) {
        if (prices[i] < minPrice) {
            minPrice = prices[i]
        } else if (prices[i] - minPrice > maxProfit){
            maxProfit = prices[i] - minPrice
        }
    }

    return maxProfit
}

