class Human6(var name: String = "太郎", var age: Int = 10) {//引数に既定値を設定すれば、セカンダリコンストラクタのように書くこともできる。
    fun intro() {
        println("私の名前は${this.name}です。${this.age}歳です。")
    }
}

fun main() {
    val human1 = Human6()
    val human2 = Human6("次郎")
    val human3 = Human6("三郎", 5)
    human1.intro()
    human2.intro()
    human3.intro()
}