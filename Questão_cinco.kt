//Classificação de Feedback de Motoristas (when e Null Safety)

fun avaliarMotorista(nota: Int?) {
    val notaFinal = nota ?: 0
    
    when (notaFinal) {
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida.")
        1, 2, 3 -> println("Precisamos melhorar.")
        0 -> println("Nenhuma avaliação fornecida.")
    }
}

fun main() {
    println("--- Teste 1 (Nota 5) ---")
    avaliarMotorista(5)
    
    println("--- Teste 2 (Nota 3) ---")
    avaliarMotorista(nota = 3)
    
    println("--- Teste 3 (Nota 2) ---")
    avaliarMotorista(nota = 2)
    
    println("--- Teste 4 (Nota nula) ---")
    avaliarMotorista(nota = null)
}