fun main() {

    fun allSum(vararg values: Int): Int {
        var result = 0
        for (value in values) {
            result += value
        }
        return result
    }
    println(allSum(2, 3, 1, 7))//可変長引数は配列として渡される。

    val arr = intArrayOf(2, 3, 1, 7)
    println(allSum(*arr))
    println(allSum(4, *arr, 3))//可変長引数で渡した値と配列の要素を合わせた新たな配列を引数に渡せる。
}