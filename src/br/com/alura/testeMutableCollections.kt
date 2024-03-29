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
    println(pedidosFreteGratis[Pedido(1, 20.0)])

//    val mapa: Map<Boolean, Pedido> = pediddos.associateBy { pedido -> pedido.valor > 50.0 }
//    println(mapa)

    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> =
        pediddos.groupBy { pedido: Pedido ->
            pedido.valor > 50.0
        }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana",
        "Paulo",
        "Gisele"
    )

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda)
    println(agenda['A'])
}

data class Pedido(val numero: Int, val valor: Double)
