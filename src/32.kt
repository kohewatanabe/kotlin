fun main() {
    val price = Price()
    price.checkPrice()
}

interface MyInterface1 {
    var price: Int
    val taxIncludePrice: Int
        get() = (this.price * 1.1).toInt()
    fun checkPrice() {
        println("税込み${taxIncludePrice}円です")
    }
}

class Price: MyInterface1 {
    override var price = 100
}