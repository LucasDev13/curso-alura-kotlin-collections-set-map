package br.com.alura

fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 150.0,
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
    for (numero in pedidos){
        println("Pedido: $numero")
    }

    //todos os valores
    println(pedidos.values)
    for (valor in pedidos){
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


}

