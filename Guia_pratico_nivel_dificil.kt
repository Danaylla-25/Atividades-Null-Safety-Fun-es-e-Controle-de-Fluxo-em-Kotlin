fun main(){
    val notas = listOf(4, 7, 8, 5, 10, 3)
    val notasAprovadas = notas.filter { it >= 7 }
    println("Notas originais: $notas")
    println("Notas aprovadas: $notasAprovadas")
}