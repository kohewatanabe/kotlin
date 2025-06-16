class Outer {
    private class Nested {
        fun show() = println("Nested is running")
    }

    fun run() {
        val nested = Nested()
        nested.show()
    }
}

fun main() {
    val o = Outer()
    o.run()
}