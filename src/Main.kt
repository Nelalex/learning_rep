// Leetcode №188 Pascal's Triangle
fun main() {
    val nestedList: List<List<String>> = listOf(
        listOf("phone","blue","pixel")

    )
    println(countMatches(nestedList, ruleKey = "color", ruleValue = "blue"))
}


fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
    var count = 0
    when (ruleKey) {
        "type" -> {
            for (i in 0 until  items.size) {
                if (items[i][0] == ruleValue)
                    count++
            }
        }
        "color" -> {
            for (i in 0 until  items.size) {
                if (items[i][1] == ruleValue)
                    count++
            }
        }
        "name" -> {
            for (i in 0 until  items.size) {
                if (items[i][2] == ruleValue)
                    count++
            }
        }
    }
    return count
}


