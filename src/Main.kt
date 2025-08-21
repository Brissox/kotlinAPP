//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


//var nombre:tipo = valor ///
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

    println("#################")
    //orden Descendente

    for (i in 10 downTo 1 step 2) {
        println("$i")
    }


    println("#################")
    //Recorrer Array o Lista

    val frutas = listOf("manzana","naranja","platano")

    for (fruta in frutas) {
        println(fruta)
    }



    println("#################")
    //Recorrer Array o Lista

    val numeros = listOf(10,20,30,40,50)

    for (i in numeros.indices) {
        println("Indice $i: ${numeros[i]}")
    }
    println(numeros[4])

    println("#################")
    //While
    var ejemploWhile = 1
    while (ejemploWhile <= 10) {
        println("$ejemploWhile")
        ejemploWhile++
    }
    println("#################")
    //DoWhile
    var ejemplodowhile = 1
    do {
        println("$ejemplodowhile")
        ejemplodowhile++
    } while (ejemplodowhile <= 5)

    println("#################")

    println(suma(1,2))

    println("#################")
    println(suma2(3,4))

    println("#################")
    println(sum3(5,6))

    println("#################")
    println(calcular(7,8,::suma2))
}

//Sintaxis tradicional
fun suma(a: Int, b: Int): Int {
    return a + b
}

//kotlin elige el tipo de dato de retorno
fun suma2(a: Int, b: Int) = a + b

//Lambda o anonimo

val sum3 = {a: Int, b: Int -> a + b}

//Orden superior

fun calcular(a: Int, b: Int, operator: (Int, Int) -> Int): Int {
    return operator(a,b)
}