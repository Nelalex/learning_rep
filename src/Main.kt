
// Leetcode №188 Pascal's Triangle
fun main() {
    generate(3)

}
fun generate(numRows: Int): List<List<Int>> {
    val triangle = MutableList(numRows) { MutableList(it + 1) { 0 } }
    for (i in 0 until numRows) {
        for (j in 0..i) {
            triangle[i][j] = if (j == 0 || j == i) 1 else triangle[i -1][j - 1] + triangle[i - 1][j]
        }
    }
    return triangle
}


