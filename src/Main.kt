//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
fun main() {
    var n: Int = 10
    var m = 1.5//型推論(コンパイラが値から変数の型を推論して勝手に付けてくれる)
    var s: Any//(変数に任意の型を持たせたい場合はAny型を指定する)
    s = 10//Kotlinでは全てのデータはオブジェクトであり、それらは全てAny型を継承している。
    s = "foo"
    print(s)
}