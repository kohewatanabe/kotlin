data class Member1(val name:String, val job: String, val age: Int)

fun main() {
    val m = Member1("海崎", "フリーター", 27)
    val (name, job, age) = m//componentN(分割代入)が内部的には呼び出されている。
    println(age)

    val n = m.copy()//プロパティの値だけをコピーして複製を作れる。
    println(m === n)
    println(n)

    val n2 = m.copy(age = 28)//特定のプロパティの値を変えることもできる
    println(n2)
}