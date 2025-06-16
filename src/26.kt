abstract class Human8(var name: String) {//抽象クラス
    abstract fun intro()//抽象メソッド
}

class TekitoHuman(name: String): Human8(name) {
    override fun intro() {
        println("どうも、レオナルド・ディカプリオです。")
    }
}

fun main() {
    val takada = TekitoHuman("高田")
    takada.intro()
}