// Leetcode №188 Pascal's Triangle
fun main() {
    println(largestMultipleOfThree(intArrayOf(3,3,5,5,8,8,8)))
}

fun largestMultipleOfThree(digits: IntArray): String {
    val result = digits.toMutableList()
    if (result.size == 1 && result[0] % 3 != 0)
        return ""
    if (result.sum() == 0)
        return "0"
    if (result.sum() % 3 == 0)
        return result.sortedDescending().joinToString("") else {
        if (result.indexOf(result.sum() % 3) != -1) {
            result.removeAt(result.indexOf(result.sum() % 3))
            if (result.sum() != 0)
                return result.sortedDescending().joinToString("")
        } else {
            for (numbers in result) {
                if (numbers % 3 == result.sum() % 3 && numbers != 0) {
                    result.remove(numbers)
                    if (result.sum() != 0)
                        return result.sortedDescending().joinToString("")
                }

            }
            for (numbers in result.sorted()) {
                if (result.sum() % 3 != 0) {
                    if (numbers % 3 != 0)
                    result.remove(numbers)
                }

            }

        }
    }
    if (result.size > 1 && result.sum() == 0)
        return "0"
    if (result.sum() == 0)
        return ""
    return result.sortedDescending().joinToString("")
}


