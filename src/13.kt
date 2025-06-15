fun main() {
    fun getTriangleArea (width: Double, height: Double): Double {
        return width * height / 2
    }
    println(getTriangleArea(10.0, 11.1))


    fun sayHello (name: String): Unit {
        println("Hello, ${name}.")
    }
    sayHello("Masao")

    //定義と同時に戻り値を代入しているため、戻り値は型推論できるため型を省略できる
    fun getTrianbleArea2 (width: Double, height: Double) = width * height / 2
    println(getTrianbleArea2(10.0, 11.1))

    
}