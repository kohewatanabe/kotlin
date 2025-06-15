
fun main() {
    var a = 100
    var b = 0x0F
    var c = 0b1010
    var d = 1.23
    var e = 1.23e+5
    println(a)
    println(b)

    //サフィックスとは接尾辞のこと、文字や数値の後ろに付けて意味を付与する
    var f = 10L
    var g = 10F
    println(f::class)
    println(g::class)
    //変数の後に ::class をつける場合、変数に代入されている値の大元のクラスのクラス内の全ての情報を取得する構文。
    //返り値にそれらの情報を全て持ったオブジェクトが返される(このような機能の事をリフレクションという)
}
