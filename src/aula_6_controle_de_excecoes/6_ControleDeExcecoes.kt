package aula_6_controle_de_excecoes

fun main() {

    //try - catch
    var x = 1

    try {
        //codigo desejado a ser executado pelo app
        x = 1/0
        println(x)

    } catch (err: Exception) {
        // caso uma execução ao bloco try aconteça
        var x = 3
        println(err.message)


    }
}