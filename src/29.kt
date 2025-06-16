interface MyInterface {//インターフェースのメソッドがデフォルトの実装を持つ場合、オーバーライドは強制されない。
    fun bar()
    fun boo() = println("foo")
}

class Bar: MyInterface {
    override fun bar() = println("bar")
}
