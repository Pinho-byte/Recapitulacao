package aula_9_laços_repetição

fun main(){
    // for
    val list = listOf(1,2,3,5,10)

    for (item in list){
        println(item)
    }
    list.forEach{
        println(it)
    }
}