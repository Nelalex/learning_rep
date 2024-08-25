import kotlin.math.absoluteValue


fun main() {
    println(fractionAddition("-5/2+10/3+7/9"))



}


fun fractionAddition(expression: String): String {
    val chislitel: MutableList<Int> = emptyList<Int>().toMutableList()
    val znamenatel: MutableList<Int> = emptyList<Int>().toMutableList()
    val newZnamenatel: MutableList<Int> = emptyList<Int>().toMutableList()

    for (i in expression.indices) {
        if (expression[i] == '/') {

            if ( (i - 2) >= 0 && expression[i - 2] == '-')
                chislitel.add(-expression[i - 1].digitToInt())
            else
                chislitel.add(expression[i - 1].digitToInt())
            znamenatel.add(expression[i + 1].digitToInt())
        }
    }
    newZnamenatel.addAll(znamenatel)
    for (i in chislitel.indices) {
        for (j in znamenatel.indices) {
            if (i != j) {
                chislitel[i] *= znamenatel[j]
                newZnamenatel[i] *= znamenatel[j]
            }
        }
    }
    var otvetChislitel:Int = chislitel.sum()
    var otvetZnametanel = newZnamenatel[0]
    val nod = gcd(otvetChislitel,otvetZnametanel)
    if (nod != 0) {
        otvetChislitel /= nod
        otvetZnametanel /= nod
    }
    var otvet = ""
    if (otvetChislitel < 0 || otvetZnametanel < 0)
        otvet += "-"
    otvet  += "${otvetChislitel.absoluteValue}/${otvetZnametanel.absoluteValue}"


    return otvet
}


fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}
