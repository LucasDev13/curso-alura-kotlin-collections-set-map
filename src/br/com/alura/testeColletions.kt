package br.com.alura

fun main() {
    val nomes: Collection<String> = setOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    println("nomes> $nomes")

    for (nome in nomes){
        println(nomes)
    }

    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")

}