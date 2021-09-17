package br.com.alura

fun main() {
    val pediddos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 50.0),
        Pedido(5, 80.0)
    )
    println(pediddos)
//    val pedidosMapeados: Map<Int, Pedido> = pediddos.associate { pedido: Pedido ->
//        Pair(pedido.numero, pedido)
//        pedido.numero to pedido
//    }

//    println(pedidosMapeados)
//    println(pedidosMapeados[1])

    val pedidosMapeados: Map<Int, Pedido> = pediddos.associateBy { pedido ->
        pedido.numero
    }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis: Map<Pedido, Boolean> = pediddos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(1,20.0)])
}

data class Pedido(val numero: Int, val valor: Double)
