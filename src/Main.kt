// Leetcode №188 Pascal's Triangle
fun main() {
    println(sumIndicesWithKSetBits(listOf(5,10,1,5,2), 1))
}


fun sumIndicesWithKSetBits(nums: List<Int>, k: Int): Int {
    var sum = 0
    for (i in 0 until nums.size) {
        val j = i.toString(2).filter { it == '1' }.length
        if (j == k) {
           sum += nums[i]
        }
    }
    return sum
}



