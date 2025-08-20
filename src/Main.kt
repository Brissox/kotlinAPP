//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"

    //valor null
    var a: String? = "Bastian"
    println(a)

    a=null
    println(a)
//acceso seguro

    val nuevaVariable = a?.length
    println(nuevaVariable)


}

//var nombre:tipo = valor ///