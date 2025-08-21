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

println("IF EN NUMEROS")
    //If
    val num1: Int = 20
    val num2: Int = 30

    if (num1 > num2) {
        println("El num1 es mayor que el num2")
    } else if (num1 == num2) {
        println("el num1 es igual al num2")
    }else{
        println("el num2 es mayor que el num1")
    }
println("############################")
    var ejemploWhen: Int = 3
    when(ejemploWhen) {
        1 -> println("La variable ejemploWhen tiene un valor de $ejemploWhen")
        2 -> println("La variable ejemploWhen tiene un valor de $ejemploWhen")
        3 -> println("La variable ejemploWhen tiene un valor de $ejemploWhen")
        4 -> println("La variable ejemploWhen tiene un valor de $ejemploWhen")
        5 -> println("La variable ejemploWhen tiene un valor de $ejemploWhen")
    }


    //FOR
    println("#################")

    for (i in 1..5) {
        println("$i")
    }

    println("#################")
    //Usando Salto

    for (i in 1..10 step 2) {
        println("$i")
    }

    println("#################")
    //Excluyendo numero

    for (i in 1 until 10) {
        println("$i")
    }



}

//var nombre:tipo = valor ///