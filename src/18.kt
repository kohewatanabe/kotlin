fun main(args: Array<String>) {
    val arr = arrayOf(1, 2, 3, 4)
    arr.forEach loop@ {//ラムダ式を抜ける
        if (it == 3) return@loop
        println(it)
    }
    println("ラムダ式を終了しました")

    arr.forEach {//高階関数に渡したラムダ式には自動的にその後悔関数のラベルがついている。
        if (it == 3) return@forEach
        println(it)
    }

    fun benchmark(unitStr: String, func: () -> Unit): String {//関数の型指定の方法(仮引数の名前:型)->戻り値の型
        val start = System.currentTimeMillis()
        func()
        val end = System.currentTimeMillis()
        return (end - start).toString() + unitStr
    }

    val time = benchmark("ミリ秒") {
        var x = 0
        for (i in 1..10000000000) {
            x++
        }
    }
    println("処理時間: " + time)
}