// Limpeza de Banco de Dados de Usuários (Laços e Múltiplas Condições)


fun limparBancoDeDados(emails: List<String?>) {
    var contasInvalidas = 0
    
    for (email in emails) {
        val tamanho = email?.length ?: 0

        if (email == null || tamanho == 0) {
            contasInvalidas++ 
            println("Aviso de Deleção: Conta inválida/vazia encontrada.")
        } else {
            println("Conta válida cadastrada: $email")
        }
    }
    
    println("--- Resumo da Limpeza ---")
    println("Total de contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {
    val listaEmails = listOf("jhonny@email.com", null, "", "benjamim@empresa.com", null, "manuela@app.com")
    
    limparBancoDeDados(listaEmails)
}