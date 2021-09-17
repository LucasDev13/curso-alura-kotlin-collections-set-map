package br.com.alura

fun main() {
    val bancoDeDados = BancoDeDados()
    bancoDeDados.salva("Alex")
    println(bancoDeDados.nomes)
    println(BancoDeDados().nomes)
}

class BancoDeDados {
    val nomes: Collection<String> get() = dados
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