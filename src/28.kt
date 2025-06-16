interface Hoge1 {
    fun hoge1()
}

interface Hoge2 {
    fun hoge2()
}

interface Hoge3 {
    fun hoge3()
}

class HogeA: Hoge1, Hoge2 {
    override fun hoge1() {}
    override fun hoge2() {}
}

class HogeB: Hoge2, Hoge3 {
    override fun hoge2() {}
    override fun hoge3() {}
}//インターフェースを使うとメソッドの実装を強制しつつ不要なメソッドは実装する必要がなくなる。
//なお、クラスの継承とインターフェースの実装を同時に行うことも可能。
