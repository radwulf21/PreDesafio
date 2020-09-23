package predesafio1

class Sistema {
    private val livros = mutableListOf<Livro>()
    private val colecoes = mutableListOf<Colecao>()
  
    fun cadastrar(livro: Livro) {
        livros.add(livro)
    }

    fun cadastrar(colecao: Colecao) {
        colecoes.add(colecao)
    }
  
  
    fun consultar(livro: Livro){

        if (livro in livros) {
            println("Livro ${livro.titulo}, escrito por ${livro.autor}, lançado em ${livro.anoLancamento} com o valor R$${livro.preco}")
        } else {
            println("Livro não encontrado")
        }

    }

    fun consultar(colecao:Colecao){
        if (colecao in colecoes){
            println("Coleção ${colecao.descricao} com o valor R$${colecao.preco}")
        } else {
            println("Livro não encontrado")
        }
    }

  
    fun efetuarVenda(colecao:Colecao) {
        colecoes.forEach {
            if (it.codigo == colecao.codigo) {
                if (colecao.qtdEstoque > 0) {
                    colecao.qtdEstoque--
                    println("A coleção ${colecao.descricao} foi vendida.")
                } else {
                    println("Estoque esgotado.")
                }
            }
        }
    }

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
}