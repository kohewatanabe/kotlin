open class Human7(var name: String) {
    open fun intro() {
        println("私の名前は${this.name}です。")
    }
}

class PerfectHuman(name: String, var place: String): Human7(name) {
    override fun intro() {
        println("${this.name}! ${this.name}! I'm a perfect human.")
        super.intro()
    }
    fun liveIn() {
        println("we live in ${this.place}.")
    }
}

fun main() {
    val nakata = PerfectHuman("Nakata", "Tokyo")
    nakata.liveIn()
    nakata.intro()
}