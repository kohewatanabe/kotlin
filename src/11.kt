fun main() {
    val arr = arrayOf(1, 2, 3)
    for (item in arr) {
        println(item)
    }

    //Mapにも使用できる
    val map = mapOf("First" to 1, "Second" to 2, "Third" to 3)
    for ((key, value) in map) {
        println("${key}:${value}")
    }

    //配列でも(Listでも)withIndex()メソッドを用いて、インデックスと値をセットで取得できる
    val list = listOf("あ", "い", "う")
    for ((index, value) in list.withIndex()) {
        println("${index}:${value}")
    }

    //範囲演算子を用いれば指定した回数繰り返すことも可能
    for (i in 1..3) {
        println(i)
    }

    //範囲演算子の上端を含めたくない場合はuntilを用いる
    for (i in 1 until 3) {
        println(i)
    }

    //デクリメントさせるにはdownToを用いる
    for (i in 3 downTo 1) {
        println(i)
    }

    //デフォルトでは1ずつ増加・減少するが、stepで増分・減分を指定することもできる
    for (i in 1..10 step 3) {
        println(i)
    }

    //ループを中断するにはbreak、周回をスキップするにはcontinueを用いる
    for (i in 1..10) {
        if (i % 3 == 0) continue
        println(i)
        if (i == 8) break
    }

    for (i in 1..3) {
        for (j in 1..3) {
            if (i * j > 5) break
            print("${i * j} ")
        }
        println()
    }
    //外側のループも修了させるには、ラベル構文を用いる
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (i * j > 5) break@outer
            print("${i * j} ")
        }
        println()
    }

}