package predesafio1

class Sistema() {

<<<<<<< HEAD
    
    fun consultar(livro: Livro){

        if (livro in livros){
            println("Livro ${livro.titulo}, escrito por ${livro.autor}, lançado em ${livro.anoDeLancamento} com o valor R$${livro.preco}")
        }

        else{
            println("Livro não encontrado")
        }

    }

    fun consultar(colecao:Colecao){
        if (colecao in colecoes){
            println("Coleção ${colecao.descricao} com o valor R$${colecao.preco}")
        }

        else{
            println("Livro não encontrado")
        }

    }

    fun efetuarVenda(colecao:Colecao){
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

}
=======
}
>>>>>>> 2201c4ee7d994286bf842b568ce6bb4f3db24222
