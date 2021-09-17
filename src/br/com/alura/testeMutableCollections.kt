package br.com.alura

fun main() {
    val assistiramCursoAndroid = listOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")
//    val assistiramAmbos = mutableListOf<String>()
    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
//    assistiramAmbos.addAll(assistiramCursoAndroid)
//    assistiramAmbos.addAll(assistiramCursoKotlin)
    //vai mostrar os elementos repitidos.
    println("assistiramAmbos repetido> $assistiramAmbos")

    //mostra somente os não repitidos.
    println("Assistiram ambos distintos ${assistiramAmbos.distinct()}")

    val assistiramCursoAndroidSet: Set<String> = mutableSetOf<String>("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlinSet: Set<String> = mutableSetOf("Alex", "Paulo", "Maria")
//    val assistiramAmbosSet: Set<String> = assistiramCursoAndroidSet + assistiramCursoKotlinSet
    val assistiramAmbosSet = mutableSetOf<String>()
    assistiramAmbosSet.addAll(assistiramCursoAndroidSet)
    assistiramAmbosSet.addAll(assistiramCursoKotlinSet)
    assistiramAmbosSet.add("Ana")
    assistiramAmbosSet.add("Ana")
    println("Assistiram ambos com Set> $assistiramAmbosSet")
}

