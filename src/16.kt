
fun getSumAverage(vararg values: Int): Pair<Int, Double> {
    var result = 0
    var count = 0.0
    for (value in values) {
        result += value
        count ++
    }
    return Pair(result, result / count)//Pairクラスのコンストラクタ
}

fun main(args: Array<String>) {
    val (sum, average) = getSumAverage(3, 4, 8, 1)
    println(sum)
    println(average)

    val (sum2, _) = getSumAverage(3, 4, 8, 1)//片方しか使わない場合
    println(sum2)
}