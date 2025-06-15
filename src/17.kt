fun main() {
    fun hyoji(n: Int) {
        println(n)
    }

    val arr = arrayOf(1, 2, 3, 4)
    arr.forEach(::hyoji)

    //ラムダ式
    arr.forEach({n: Int -> println(n)})
    arr.forEach({n -> println(n)})
    arr.forEach() {n -> println(n)}
    arr.forEach {n -> println(n)}
    arr.forEach {println(it)}
}