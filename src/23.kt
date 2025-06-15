class Human5(var name: String, var age: Int) {
    constructor(name: String):this(name, 10) {}//渡された引数に応じてプロパティ初期化処理を分岐させるのがセカンダリコンストラクタ
    constructor():this("太郎") {}//この場合のthisはパターンが合致したコンストラクタ(今まさに初期化されている最中の、これから完成する新しいインスタンス)を指す
    fun intro() {
        println("私の名前は${this.name}です。${this.age}歳です。")
    }
}

fun main() {
    val human1 = Human5("三郎", 5)
    val human2 = Human5("次郎")
    val human3 = Human5()
    human1.intro()
    human2.intro()
    human3.intro()
}