//when式
//式の値に応じて処理を分岐させるにはwhen式を使う
fun main() {
    val x = 1
    when (x) {
        1 -> println("xは1です")
        2 -> println("xは2です")
        else -> {//ブロックとして書くと複数行書ける
            println("xは1でも2でもないです")
        }
    }
    //条件の箇所は色々な書き方ができる
    val score = 80
    val msg = when (score) {
        100, 99 -> "素晴らしい"//複数の値
        in 60..98 -> "合格です"//範囲を指定
        !in 60..100 -> "不合格です"//指定範囲にない
        else -> "不正な点数です"
    }
    println(msg)

    //is演算子を利用することによって、チェックする変数(式)の型で処理を分岐させることもできる
    val obj: Any = "あいうえお"
    when (obj) {
        is String -> println("文字数は${obj.length}です")
        else -> println("String型ではない型です")
    }

    //引数を取らずに宣言すれば、if式の代替えとしても使える
    val d = 10
    when {
        d <= 5 -> println("dは5以下です")
        d <= 10 -> println("dは10以下です")
        else -> println("dは10より大きいです")
    }
}