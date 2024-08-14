


//Given two arrays of strings list1 and list2, find the common strings with the least index sum.
//
//A common string is a string that appeared in both list1 and list2.
//
//A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.
//
//Return all the common strings with the least index sum. Return the answer in any order.


fun main() {
    println(findRestaurant(arrayOf("Shogun","Tapioca Express","Burger King","KFC"), arrayOf("Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun")))

}


fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
    var minValue = Int.MAX_VALUE
    val minValueElements = emptyList<String>().toMutableList()
    val commonElements = list1.toList().intersect(list2.toList())
    for (element in commonElements) {
        val indexSum = list1.indexOf(element) + list2.indexOf(element)
        if  (indexSum == minValue) {
            minValueElements.add(element)
        }
        if (indexSum < minValue) {
            minValue = list1.indexOf(element) + list2.indexOf(element)
            minValueElements.clear()
            minValueElements.add(element)
        }


    }
    return minValueElements.toTypedArray()
}