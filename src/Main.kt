fun main() {
    val n = readln().toInt()
    println(countLargestGroup(n).toString())

}
//https://leetcode.com/problems/count-largest-group/description/
//
fun countLargestGroup(n: Int): Int {
    val digitSizeMap = mutableMapOf<Int, MutableList<Int>>()
    for (number in 1 .. n) {
        val digitsSum = number.toString().map { it.digitToInt() }.sum()
        digitSizeMap.computeIfAbsent(digitsSum) { mutableListOf()}.add(number)
    }

    var maxValue = 0
    var maxValueCount = 0
    for ((key, value) in digitSizeMap) {
        when {
            value.size > maxValue -> {
                maxValue = value.size
                maxValueCount = 1
            }
            value.size == maxValue -> {
                maxValueCount ++
            }
        }
    }

    return maxValueCount
}


/*
fun countLargestGroup(n: Int): Int {
    var maxValue: Int = 0
    var maxValueCount: Int = 0
    for (number in n downTo 1) {
        val digitsSum = number.toString().map { it.digitToInt() }.sum()
        val sum = (digitsSum.toString() + number.toString()).map { it.digitToInt() }.size
        when {
            sum > maxValue -> {
                maxValueCount = 1
                maxValue = sum
            }
            sum == maxValue -> {
                maxValueCount++
            }
        }
    }
    return  maxValueCount
}*/