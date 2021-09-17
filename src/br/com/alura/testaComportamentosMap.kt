package br.com.alura

fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 100.0,
        6 to 80.0
    )

//    val valorPedido = pedidos.getValue(5)
//    println(valorPedido)

    //
//    val mensagem: Double? = pedidos.getOrElse(0) { 0.0 }
//    println(mensagem)

    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    //todas as chaves
    println(pedidos.keys)
    for (numero in pedidos) {
        println("Pedido: $numero")
    }

    //todos os valores
    println(pedidos.values)
    for (valor in pedidos) {
        println("Valor do pedido: $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 70.0
    }

    println("Pedidos filtrados: $pedidosFiltrados")

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println("Pedidos pares> $pedidosPares")

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70
    }
    println("Pedidos acima> $pedidosAcima")

    //juntar dois maps, aqui ele cria um novo map
    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))
    println(pedidos)

    //remove os elementos do map e retorna um novo map
    println(pedidos - listOf(6, 5))
    println(pedidos)

//    pedidos.putAll(setOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0, 8 to 20.0))
    pedidos += setOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0, 8 to 20.0)
    println(pedidos)

    //removendo os key e values
    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    //se tiver dois valores iguais, vai remover o primeiro que achar.
    pedidos.values.remove(100.0)
    println(pedidos)

    //removendo pelo chave usando -=
    pedidos -= 6
    println(pedidos)
}