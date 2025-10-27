package aula_6_controle_de_excecoes

fun main() {

    val a: String? = null

    val result: String = a ?: "1" // Quando se usa "?:" ele chamando de operador elvis ele ajuda a prevenir nulos
                                    // Assim quando valor for nulo ele precavidamente era gerar o valor "1"

    println(result)

    var b: Int = -1

    b = a?.toInt() ?: 0

    println(b)

    // Operador de acersão nula
    // ele é nulo porem diz q ñ é nulo usando "!!"
    if ( a != null){

        println(a!!.toInt())

    }

    // Ele nos projete de que acontece uma troca sem q ela faca uma conversão de valores
    val c = a as? Int
    println(c)

    b?.let{ // it é passado como parametro

        println(it)

    }


}