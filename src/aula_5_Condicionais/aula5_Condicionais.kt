package aula_5_Condicionais

fun main() {

    val x = 150
    val y = 50

    var result = if (x > y ){
        println("valor maior")
    } else if(x < y ){
        println("valor menos")
    } else if(y == x){
        println("valor igual")
    } else {
        "diferente"
    }

    println("if / else if/ else")
    println( "resultado = $result \n" )


    val result2 = when (x){
        in 1..100 -> "valor cabe no paramentro de 1 à 100"
        100 -> "100"
        in 101..200 -> "valor cabe no paramentro de 101 à 200"
        else -> "Diferente"
    }

    println("if / else if/ else")
    println( "resultado 2 = $result2" )


}