class Human {
    var name = "名無し"
    var age = 20//プロパティ=変数+アクセサ(メソッド)の組
        set(value) {//アクセス修飾子も使える。アクセサーはメソッド。
            if (value < 0) {
                println("年齢が不正です。")
            } else {
                field = value//バッキングフィールド
            }
        }
    fun intro() {
        println("私の名前は${name}です。${age}歳です。")
    }
}

fun main() {
    val human = Human()
    human.intro()
    human.age = -1
    println(human.name)
}