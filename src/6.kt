//Kotlinで複数の要素をまとめて扱うには、Javaと同様に配列とコレクションを用いる。
//配列と代表的なコレクション(List, Set, Map)は以下のような特徴がある。

fun main() {
    var a = arrayOf(1, 2, 3)//配列の定義にはarrayOfという関数を使う
    var b = intArrayOf(1, 2, 3)//配列の要素の型を指定する場合はArrayOfの前にその型名を付ける
    var c: Array<String?> = arrayOfNulls(3)
    var d = Array(3, {i -> i * 2})//Arrayクラスのコンストラクタを使った書き方もある。第一引数は要素数、第二引数は要素の式(ラムダ式)
    println(a[1])

    var list = listOf("あ", "い", "う")
    var set = setOf("A", "B", "A", "C", "D", "B")
    var map = mapOf("First" to 1, "Second" to 2, "Third" to 3)
    println(list)
    println(set)
    println(map)
    //Listは読み取り専用になるので、
    //変更可能なコレクションを作成するには、mutableコレクション名of()関数を使ってmutableListを作る。

    var lists = mutableListOf(1, 2, 3)
    lists[2] = 4
    println(lists)

    //以下のような記述をすれば、Listも変更される
    var list1 = mutableListOf(1, 2, 3)
    var list2: List<Int> = list1//mutableListはListを継承しているため入れられる
    list1[2] = 4
    println(list2)
}