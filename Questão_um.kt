//Sistema de Cupons Avançado (when e NullSafety)

fun calcularDesconto(valor: Double, cupom: String?): Double {
    return when (cupom) {
        "PROMO10" -> valor - 10.0
        "PROMO20" -> valor - 20.0
        else -> valor
    }
}
fun main() {
    val precoProduto = 25.0
    
    println("Preço Original: R$ $precoProduto")
    println("Com PROMO10: R$ ${calcularDesconto(precoProduto, "PROMO10")}")
    println("Com PROMO20: R$ ${calcularDesconto(precoProduto, "PROMO20")}")
    println("Com Cupom Inválido: R$ ${calcularDesconto(precoProduto, "CUPOMFALSO")}")
    println("Com Cupom Nulo: R$ ${calcularDesconto(precoProduto, null)}")
}
