//Kotlinでクラス変数・クラスメソッドを利用するには、コンパニオンオブジェクトを利用する必要がある。
class MyClass {
    companion object Factory {//コンパニオンオブジェクト名は省略可能
        fun create(): MyClass = MyClass()
    }
}
fun main() {

    val my = MyClass.create()
    println(my::class)
}