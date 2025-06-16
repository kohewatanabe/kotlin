//引数の型や数が異なっていれば同じ名前のメソッドを定義することが出来る。
//これをメソッドのオーバーロードという。
fun main() {
    fun show() = println("ok")
    fun show(value: String) = println(value)

    show()
    show("ok")

    //Kotlinでは引数にデフォルト値を持たせることが出来るので、オーバーロードは演算子以外では基本的に使用しない。
    fun show1(value: String = "ok") = println(value)
    show1()
    show1("ok")
}