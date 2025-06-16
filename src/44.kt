fun String.repeat(n: Int): String {
    var builder = StringBuilder()
    for (i in 1..n) {
        builder.append(this)
    }
    return builder.toString()
}

fun main() {
    val hoge = "ほげ"
    println(hoge.repeat(3))
}