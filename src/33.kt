open class Person{}
class BusinessPerson: Person() {
    fun work() = println("Working")
}
fun main() {
    val p: Person = BusinessPerson() //アップキャスト
    if (p is BusinessPerson) {//ダウンキャスト
        p.work()//スマートキャスト
    }
}