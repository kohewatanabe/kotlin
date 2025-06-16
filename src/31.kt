//Kotlinではインターフェース中にプロパティを定義できる
interface FooInterface {
    var foo: String
    fun foo() = println(foo)
}

class Foo: FooInterface {
    override var foo = "foo"
}

fun main() {
    val foo = Foo()
    foo.foo()
}