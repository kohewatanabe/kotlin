interface Hogex {
    fun hoge() = println("hogex")
}

interface Hogey {
    fun hoge() = println("hogey")
}

class Myclass: Hogex, Hogey {
    override fun hoge() {
        super<Hogex>.hoge()
        super<Hogey>.hoge()
    }//super<インターフェース>と書くことで、特定のインターフェースを指定できる。
}