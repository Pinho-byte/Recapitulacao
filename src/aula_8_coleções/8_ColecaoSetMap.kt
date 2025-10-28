package aula_8_coleções

fun main(){

    //set

    // setOf não permite valores igual de tipos iguais mesmo que seja inserido ele ñ vai mostrar
    println("Set não mutavel")
    val set = setOf(1, 2, 3, 2) // set por padrão ele ñ é mutavel
    println(set)
    println("\n")

    println("Set Mutavel")
    //Já mutableSetOf aceita alteração dentro dele
    val setMutable = mutableSetOf(1, 2, 3, "kotlin", "java", 4.0f, 5.0f)

    setMutable.add(4)
    setMutable.remove(1)
    println(setMutable)
    println("\n")

    // Por padrã o hashSetOf ela é já mutavel por com a mesma caracterisca de ser itens unicos
    val hashSet = hashSetOf(1, 2, 3)
    println(hashSet)
    println("\n")

    // Map
    //Mais conhecido como dicionario dentro da programação
    val map = mapOf<Int, String>(Pair(1, "Kotlin"), 1 to "kotlin", 2 to "kotlin1", 3 to "kotlin2")

    println(map)

    println(map.keys)
    println(map.values)
    println(map.entries)
    println("\n")

    // Segue o mesmo parametro do HashSetOf ele é já mutavel tambem
    val hashMap = hashMapOf(1 to "kotlin")
    println(hashMap)

    /*Por indicação é sempre bom usar o hash pq ele ajuda em muito pois tem um desempenho de leitura
        muito melhor que do sem usar o hash no set ou no map
     */

}