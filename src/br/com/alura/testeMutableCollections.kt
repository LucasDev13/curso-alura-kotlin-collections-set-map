package br.com.alura

fun main() {
    val bancoDeDados = BancoDeDados()
    val nomesSalvos: Collection<String> = bancoDeDados.nomes
    bancoDeDados.salva("Alex")
    println(nomesSalvos)
    println(BancoDeDados().nomes)
}

class BancoDeDados {
    val nomes: Collection<String> get() = dados.toList()
    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object{
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    for (nome in nomes) {
        println(nomes)
    }
    println(nomes)
    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")
}