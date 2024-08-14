

//206. Reverse Linked List not done


fun main() {
    println(sumOfTheDigitsOfHarshadNumber(333))

}

fun sumOfTheDigitsOfHarshadNumber(x: Int): Int {
    val y = x.toString().map { it.digitToInt() }.sum()
    if (x % y == 0)
        return y
    else
        return  -1
}