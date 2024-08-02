fun main() {
    val n = readln().toLong()
    println(thousandSeparator(n).toString())

}

    // https://leetcode.com/problems/thousand-separator/description/

    fun thousandSeparator(n: Long): String {
        val answer = n.toString().toCharArray().toMutableList()

        val size = answer.size - 1
        for (digit in size downTo 0) {
            if ( (size - digit) % 3 == 0 && size - digit > 2)
                answer.add(digit + 1, '.')

        }
        return answer.joinToString(separator = "")

    }

    // More short and suitable solution
/*  fun formatWithThousandSeparators(number: Long): String {
      return number.toString().reversed().chunked(3).joinToString(".").reversed()
  }*/



