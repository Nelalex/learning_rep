
fun main() {
    println(isRectangleOverlap(intArrayOf(0,0,2,2), intArrayOf(1,1,3,3)))
}

// https://leetcode.com/problems/rectangle-overlap/description/
fun isRectangleOverlap(rec1: IntArray, rec2: IntArray): Boolean {
    return when{
        rec1[0] >= rec2[2] -> false
        rec1[1] >= rec2[3] -> false
        rec2[0] >= rec1[2] -> false
        rec2[1] >= rec1[3] -> false
        else -> true
    }
}






