class Coordinate(val x: Double, val y: Double) {
    operator fun plus(c: Coordinate): Coordinate {//plusメソッドの頭に演算子を表すoperatorキーワードをつける
        return Coordinate(this.x + c.x, this.y + c.y)
    }
}

fun main() {
    val c1 = Coordinate(1.0, 2.0)
    val c2 = Coordinate(0.5, 1.5)
    val c3 = c1 + c2
    println("Coordinate:(${c3.x}, ${c3.y})")
}