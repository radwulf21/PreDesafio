package predesafio1

class Sistema() {
    val livros = mutableListOf<Livro>()
    val colecoes = mutableListOf<Colecao>()

    fun efetuarVenda(livro: Livro) {
        livros.forEach {
            if (it.codigo == livro.codigo) {
                if (it.qtdEstoque > 0) {
                    it.qtdEstoque--
                    println("Livro Vendido!")
                } else {
                    println("Estoque Esgotado!")
                }
            }
        }
    }

    fun cadastrar(livro: Livro) {
        livros.add(livro)
    }

    fun cadastrar(colecao: Colecao) {
        colecoes.add(colecao)
    }
}