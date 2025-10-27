package aula_8_coleções

fun main(args: Array<String>){

    //Array

    println("Array ")

    val array: Array<Int> = arrayOf(1,2,3,4,5)
    val array1: Array<String> = arrayOf("1","2","3","4")

    //JointToString e um recurso super importante pode se colocar caractericas dentro do array
    println(array.joinToString(prefix = "[", postfix = "]", separator = "|"))
    println(array1.joinToString())

    val array2: Array<Int> = arrayOf(6,7,8,9,10)

    //Aqui faz a soma dos array existente no codigo, contudo so faz a soma os da mesma proprieda
    val arraySun = array + array2

    println(arraySun.joinToString(prefix = "[", postfix = "]", separator = "-" ))


    // List

    println("\nSeparar lista")

    //lista não mutavel aonde so pode usar aquilo que esta apenas dentro ela
    val list = listOf(1,2,3, "1", false, 1..3,4.0f, 10, 20 ,18)
    //lista mutavel aquela pode adicionar itens que ñ estão dentro dela
    val list1 = mutableListOf(1,2,3)

    list1.add(4)
    println(list1)

    // Faz a filtrgem de uma lista com vários itens diferentes
    val listfloot : List<Float> = list.filterIsInstance<Float>()

    println(listfloot)

    //Neste aqui usamos apenas o filter comum com o
    val listIntHigherThan2 = list.filter{
        it is Int && it > 2
    }
    println(listIntHigherThan2)
    println("\n")

    val listIntMessy = listOf(9, 18, 1, 3, 750,-2344, 8, 16, 32_550, 2)
    val listStringMessy = listOf("Guilherme", "Bernardo", "lionel", "alice", "liz")


    // Metodo sorted ele é usado na list para ajustar os dados mesmo que estejam embaralhados isso vale tanto itens em String quanto para em INT
    println("Itens ordenados")
    println(listIntMessy.sorted())
    println(listStringMessy.sorted())
    println("\n")
    // Ele inverte os lados o último fica em primeiro e o primeiro fica em último
    println("Itens Invertidos")
    println(listIntMessy.reversed())
    println(listStringMessy.reversed())
    println("\n")


    val intMax = listIntMessy.max()
    val intMin = listIntMessy.min()

    println("Instancia de valores")
    println(intMax)
    println(intMin)
    println("\n")

    //Usado par localizar itens tanto o primeiro quanto o ultimo usando o find
    println("Metodo Find")
    val findFirst0dd = list.find { it is Int && it % 2 != 0 }
    val findLast0dd = list.findLast { it is Int && it % 2 != 0 }

    println(findFirst0dd)
    println(findLast0dd)
    println("\n")

    // Serve para alterar os valores para ter uma noção de algum valor que precise indentificar por outra perspetiva
    val booleanmapIntHigherThan10 = listIntMessy.map { it is Int && it > 10}

    println(booleanmapIntHigherThan10)
}