package br.com.alura

fun testaMap(pedidos: MutableMap<Int, Double>) {
    //é mais comum utilizar o infix to, mas ele tem um problema de performance com maps com muitos valores.
    //Ele tem uma perca de performance.
    println("pedidos map> pedidos")

    //para pegar um elemento do map, você precisa passar a key do map.
    //mas esse retorno pode ser null porque ele não garante que tem um valor lá. Precisa tratar isso.
    val pedido = pedidos[1]
    pedido?.let {
        println("pedidos $it")
    }

    for (p: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }

    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    //putIfAbsent vai adicionar se a key e value não existir no map
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)
    //se tenta atualizar, o map não vai fazer nada.
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)

    //remove pela chave
    pedidos.remove(6)
    println(pedidos)

    //remove se a key bater com o value. Neste caso não vai remover, porque 100 não é o valor de key 3
    pedidos.remove(3, 100.0)
    println(pedidos)
}