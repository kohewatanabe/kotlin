class Human3 constructor(name: String, age: Int) {
    var name: String
    var age: Int

    init {
        this.name = name
        this.age = age
    }

    fun intro() {
        println("私の名前は${this.name}です。${this.age}歳です。")
    }
}

fun main() {
    val taro = Human3("太郎", 10)
    taro.intro()
}