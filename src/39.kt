//ジェネリックとは
//具体的なデータ型に依存しない、抽象的かつ汎用的なコード記述を可能にする手法
//定義時は具体的なデータ型に依存しないようにしておいて、利用時にデータ型を設定することで
//汎用的なコード記述を可能にするのがジェネリックプログラミングの思想(ソースコード上でTと書いた部分がクラスロード時に全てObjectに置き換わって定義される)
class genericExample<T>(var value: T) {
    fun getProp(): T {
        return value
    }
}

fun main() {
    val g1 = genericExample<String>("foo")
    val g2 = genericExample<Int>(1)
    val g3 = genericExample("hoge")
    println(g1.getProp())
    println(g2.getProp())
}
