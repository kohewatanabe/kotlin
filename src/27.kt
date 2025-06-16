abstract class Hoge {
    abstract fun hoge1()
    abstract fun hoge2()
    abstract fun hoge3()
}

class HogeD: Hoge() {
    override fun hoge1() {}
    override fun hoge2() {}
    override fun hoge3() {}
}

class HogeE: Hoge() {
    override fun hoge1() {}
    override fun hoge2() {}
    override fun hoge3() {}
}//単一継承だとサブクラスに必要なメソッド全てをまとめておく必要があり、サブクラスは不要なメソッドの実装も強制される。