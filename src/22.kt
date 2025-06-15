class Human4(var name: String, var age: Int) {//プロパティの宣言と初期化を同時に行える。
    fun intro() {
        println("私の名前は${this.name}です。${this.age}歳です。")
    }
}

fun main() {
    val human = Human4("太郎", 10)
    human.intro()
}