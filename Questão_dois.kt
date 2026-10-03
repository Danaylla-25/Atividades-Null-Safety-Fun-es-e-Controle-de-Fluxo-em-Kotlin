//Auditoria de Entregas (Laço de Repetição e Elvis Operator)

fun auditarEntregas(enderecos: List<String?>) {
    for (endereco in enderecos) {
        val enderecoVerificado = endereco ?: "Endereço Desconhecido"
        
        if (enderecoVerificado == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $enderecoVerificado")
        }
    }
}

fun main() {
    val listaDeEnderecos = listOf("Rua das castanheiras, 28", null, "Avenida Djalma Batista, 63", null)
    
    println("--- Iniciando Auditoria ---")
    auditarEntregas(listaDeEnderecos)
}
