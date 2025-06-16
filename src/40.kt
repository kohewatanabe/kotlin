//ジェネリクスに渡せる型を制限したい場面のある。その際は<T: クラス名>の形で記述する。
//このように書くと、「型引数の後に書いたクラス、もしくはその派生クラス」に型を制限することができるようになる。
open class Hoge5() {}
class Foo1(): Hoge5() {
    val foo = "foo"
}

class Generic<T: Hoge5>(var obj: T) {
    fun getProp(): T {
        return obj
    }
}

fun main() {
    val g1 = Generic<Foo1>(Foo1())
    println(g1.getProp().foo)
}