
//nullとは値(オブジェクトの参照)を持たないことを意味する値(nullという特定のビットパターンが入っている)。変数にオブジェクトの参照が設定されていない状態がnull
fun main() {
//    var foo: String = "foo"
//    foo = null

    var fii: String? = "foo"
    fii = null

//あえてnullを許容したい時は、型名の後ろに「?」を付ける。
//このような型をNullable型(null許容型)と呼ぶ。Stringに限らずNullable型として定義することができる。

    var a: Int = 10000
    var b: Int = a
    var c: Int? = a

    println(a == b)
    println(a === b)
    println(a == c)
    println(a === c)
//非null型をNullable型に代入すると暗黙的な型変換(ボクシング)が発生する。

//    var foo1: String? = "foo"
//    var foo2: String = foo1
    var a1: String? = "a"
    var a2: Any? = a1
//Nullable型を非null型に代入することはできない

    var d: String? = "foo"
    println(d?.length)

    var e: String? = null
    println(e?.length)
//Nullable型のメンバにアクセスする際には「?.(セーフコール演算子)」を使う

    var f: String? = null
    println(f?.length ?: 0)
//nullの場合に返す既定値を設定するには「?:」演算子を行う

    var g: String? = "foo"
    println(g!!.length)
//Nullable型を非null型に変換するには「!!」演算子を使う

}
