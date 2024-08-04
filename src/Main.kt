
fun main() {
    println(minNumber(intArrayOf(0,0,2,2), intArrayOf(1,1,3,3)))
}

// https://leetcode.com/problems/form-smallest-number-from-two-digit-arrays/description/
// I know that it's not effective not to store min values and always invoke methods, its just for practise
fun minNumber(nums1: IntArray, nums2: IntArray): Int {
    val minCommon = (nums1 intersect nums2.toSet())
    if (minCommon.isNotEmpty())
        return minCommon.min()
    val minDigit = if (nums1.min() > nums2.min()) nums2.min() else nums1.min()
    return if (minDigit == nums2.min())
            (nums2.min() * 10 + nums1.min())
    else
            (nums1.min() * 10 + nums2.min())

}






