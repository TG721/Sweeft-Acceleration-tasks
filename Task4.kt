//Task 4
//solution
fun binaryStringSum(a: String, b: String): String {
    var carry = 0
    var i = a.length - 1
    var j = b.length - 1
    val sum = StringBuilder()

    while (i >= 0 || j >= 0 || carry > 0) {
        val digitA = if (i >= 0) a[i--] - '0' else 0
        val digitB = if (j >= 0) b[j--] - '0' else 0
        val digitSum = digitA + digitB + carry
        sum.append(digitSum % 2)
        carry = digitSum / 2
    }

    return sum.reverse().toString()
}

fun main() {
    //testing
    val a = "1010"
    val b = "1011"
    val sum = binaryStringSum(a, b)
    println(sum)
}