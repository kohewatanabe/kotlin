//オブジェクト宣言すると、１つのインスタンスしか持たないようなクラスを用意できる(シングルトンパターン)。
object TanakaTaro {
    val name = "田中太郎"
    var clothe = "Tシャツ"

    fun intro() {
        println("${name}は${clothe}を着ている。")
    }
}

fun main() {
    TanakaTaro.clothe = "Yシャツ"
    TanakaTaro.intro()
}//既存のクラスを継承することも可能だがその場合は基底クラスのコンストラクタに値を渡して上げる必要がある。