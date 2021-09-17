package br.com.alura

fun main() {
    val pedidos = mapOf(Pair(1, 20.0), Pair(2, 43.0), 3 to 50.0, 4 to 12.0)
    //é mais comum utilizar o infix to, mas ele tem um problema de performance com maps com muitos valores.
    //Ele tem uma perca de performance.
    println("pedidos map> pedidos")

    //para pegar um elemento do map, você precisa passar a key do map.
    //mas esse retorno pode ser null porque ele não garante que tem um valor lá. Precisa tratar isso.
    val pedido = pedidos[1]
    pedido?.let {
        println("pedidos $it")
    }

    for (pedido: Map.Entry<Int, Double> in pedidos){
        println("número do pedido: ${pedido.key}")
        println("valor do pedido: ${pedido.value}")
    }
}