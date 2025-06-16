data class Member(var name: String = "") {
    var age: Int = 0
}//コンストラクタとインスタンス変数初期化子だと、初期化子->コンストラクタによる初期化という順序がある。

fun main() {
    val m1 = Member("佐藤")
    m1.age = 30
    val m2 = Member("佐藤")
    m2.age = 22
    println(m1 == m2)//==演算子はequalsメソッドを呼び出す。
    println(m1)
    //ageプロパティはプライマリコンストラクタで定義されていないので、ageプロパティの値が同じでなくてもtrueを返している
}