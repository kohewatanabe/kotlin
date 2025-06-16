//ジェネリック関数とは、引数と戻り値の型を関数の呼び出し時に決めることのできる関数
fun main() {
    fun <T> tail(arr: Array<T>): T = arr[arr.size - 1]

    val arr1 = arrayOf(1, 2, 3)
    val arr2 = arrayOf("あ", "い", "う")
    println(tail<Int>(arr1))
    println(tail(arr1))
    println(tail<String>(arr2))
}