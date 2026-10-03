// Questão 6: Função Lambda para Cálculo de Gorjeta (Lambda, Null Safety e if)

val calcularGorjeta: (Double?) -> Double = {
    if (it == null || it < 0) {
        0.0
    } else {
        it
    }
}

fun main() {
    println("--- Testando Valores ---")
    
    val testeNulo = calcularGorjeta(null)
    println("Teste Nulo (null): R$ $testeNulo")
    
    val testeNegativo = calcularGorjeta(-22.0)
    println("Teste Negativo (-22.0): R$ $testeNegativo")
    
    val testeValido = calcularGorjeta(30.0)
    println("Teste Válido (30.0): R$ $testeValido")
}

