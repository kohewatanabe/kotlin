//nullとは？
//値(オブジェクトの参照)を持たないことを意味する値(nullという特定のビットパターンが入っている)。変数にオブジェクトの参照が設定されていない状態がnull
//Javaでは明示的に初期化しない限りnullが初期値になっていたので、nullの変数のメソッドやフィールドにアクセスして
//NullPointerExceptionを引き起こすことがとても多かった。
//そこで、kotlinはnullを許容しないように作られている。
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
//変数aを、非null型の変数bと、Nullable型の変数cにそれぞれ代入している。
//aとbは同じオブジェクトなので同値かつ同一
//一方で、aとcは下2桁からもわかるように、同値だが同一ではない。
//暗黙的な型変換(ボクシング)が発生して別のオブジェクトになっている。

//    var foo1: String? = "foo"
//    var foo2: String = foo1
    var a1: String? = "a"
    var a2: Any? = a1
//Nullable型を非null型に代入することはできない
//Any型を指定すると任意の型を代入できるという事だったが、厳密には「Any型を指定すると任意の非null型を代入できる」
//かつ「Any?型を指定するとnull型を含む任意の型を代入できる」と言える

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
