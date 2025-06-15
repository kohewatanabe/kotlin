class Human2 {
    private var name = "名無し"
    var age = 20

    fun intro() {
        println("私の名前は${name}です。${age}歳です。")
    }
}

fun main() {
    val human = Human2()
    human.intro()
}