package aula_8_coleções

fun main(args: Array<String>){

    //Array

    println("Array ")

    val array: Array<Int> = arrayOf(1,2,3,4,5)
    val array1: Array<String> = arrayOf("1","2","3","4")

    println(array.joinToString(prefix = "[", postfix = "]", separator = "|"))
    println(array1.joinToString())

    val array2: Array<Int> = arrayOf(6,7,8,9,10)

    val arraySun = array + array2

    println(arraySun.joinToString(prefix = "[", postfix = "]", separator = "-" ))


    // List

    println("\nSeparar lista")

    val list = listOf(1,2,3)
    val list1 = mutableListOf(1,2,3)

    list1.add(4)
    println(list1)


}