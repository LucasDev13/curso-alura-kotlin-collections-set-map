package br.com.alura

fun testaCopia() {
    val bancoDeDados = BancoDeDados()
    //feito uma cópia/atribuição para a varável nomesSalvos. Essa cópia é por referência.
    //assim podemos burlar o que foi definido na classe de banco de dados.
    //podemos mudar o tipo da variável nomesSalvos, mas vamos ter um problema de compilação, mas podemos burlar com
    //um cast para MutableColletion e funciona normalmente, mas deveria ter um problema, dado que não estamos trabalhando
    //com Mutable.
    //Isso acontece porque realmente internamente a instância ainda é de um Mutable, e dado isso essa converção é sim
    //compatível.
//    val nomesSalvos: MutableCollection<String> = bancoDeDados.nomes as MutableCollection<String>
//    nomesSalvos.add("Paulo")// conseguimos adicionar o nome normalmente, mesmo ela estando privada
    val nomesSalvos: Collection<String> = bancoDeDados.nomes
    bancoDeDados.salva("Alex")
    println(nomesSalvos)
    println(BancoDeDados().nomes)
}

class BancoDeDados {
    //o toList() faz uma snapshot(cópia) real da coleção. Estamos devolvendo uma cópia e dados que estamos devolvendo
    //uma cópia, naõ vai ser possível modificar os dados reais.
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