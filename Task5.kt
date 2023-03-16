//Task 5
fun countVariants(n: Int): Int {
    var a = 1
    var b = 1
    for (i in 2..n) {
        val c = a + b
        a = b
        b = c
    }
    return b
}
fun main() {
    print(countVariants(3))
}