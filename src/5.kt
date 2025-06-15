//型同士に互換性があるのであれば、必用に応じて型を変換することもできる
//Javaではワイドニングを自動的に行ってくれたが、Kotlinでは明示的に変換する必要がある
fun main() {
    var a: Float = 1.2f
    var b: Double = 10.0

    //上記のようなサフィックス、もしくはtoデータ型()メソッドを用いて変換する。

    var c = 10
    var d: Long = a.toLong()

    //toLong以外にも、toByte()やtoFloat()など変換先に型ごとにメソッドがある(ワイドニングの分だけ)。

}