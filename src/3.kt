fun main() {
    //Kotlinは2種類の文字列リテラルを持つ(これら以外にないの？)
    //1.エスケープ文字を含む文字列. 2.改行やタブなど任意の文字列を含む文字列
    var msg1 = "こんにちは。 \n私はKotlinを学んでいます。 "
    var msg2 = """こんにちは。
               |私はKotlinを学んでいます。""".trimMargin()//String型クラスのメソッド。行頭を揃える。
    println(msg1)
    println(msg2)

    var data = arrayOf(1, 2, 3)
    println("配列dataの先頭の値は${data[0]}で、要素数は${data.size}です。")
    println("1+1は、${1+1}です。")
}