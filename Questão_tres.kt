// Questão 3: Validação de Perfil de Streaming (if/else e Safe Call)                                                                  

fun validarBioInfantil(biografia: String?) {
    val tamanho = biografia?.length ?: 0
    
    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

fun main() {
    val bioCurta = "Gosta de desenhos coloridos."
    val bioLonga = "Gosto de assistir os filmes da barbie e das princessas da Disney mas também gosto dde rei leão e toy story não gosto de aviões e turbo."
    val bioNula = null
    
    print("Teste Bio Curta: ")
    validarBioInfantil(bioCurta)
    
    print("Teste Bio Longa: ")
    validarBioInfantil(bioLonga)
    
    print("Teste Bio Nula: ")
    validarBioInfantil(bioNula)
}
