//入れ子のクラスからアウタークラスのベンバーにアクセスしたいケースもある
//その場合はinner修飾子を付与してインナークラスとして内部のクラスを定義する。
class Outer2(val name: String = "Outer") {
    inner class Nested(val name: String = "Nested") {
        fun show() {
            println("${this@Outer2.name} called show()")//デフォルトの設定とは違う場所を指定できるのがラベル構文(デフォルトはthisはNestedのインスタンスであるnestedを指すが、Outer2のインスタンスであるoを指す)
            println("${name} is running")
        }
    }

    fun run() {
        val nested = Nested()
        nested.show()
    }
}

fun main() {
    val o = Outer2()
    o.run()
}