fun main() {
    fun getTriangleArea(width: Double = 1.0, height: Double = 1.5): Double {
        return width * height / 2
    }
    println(getTriangleArea())
    println(getTriangleArea(3.0))

    fun getTriangleArea2(width: Double = 1.0, height: Double = 1.5): Double {
        return width * height / 2
    }
    println(getTriangleArea2(height = 3.0, width = 2.0))
    println(getTriangleArea2(height = 3.0))


}