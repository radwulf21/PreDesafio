package predesafio1

fun main(){

    // Livros para testes
    val livro1 = Livro(111, "Dom Casmurro", "Machado de Assis", 1899, 0, 11.0)
    val livro2 = Livro(222, "O Alienista", "Machado de Assis", 1882, 2, 12.0)
    val livro3 = Livro(333, "Iracema", "José de Alencar", 1865, 3, 15.0)
    val livro4 = Livro(444, "A Hora da Estrela", "Clarice Lispector", 1977,4, 9.0)
    val livro5 = Livro(555, "O Mulato", "Aluísio Azevedo", 1881, 5, 5.0)
    val livro6 = Livro(666, "O Cortiço", "Aluísio Azevedo", 1890, 6, 6.0)
    val livro7 = Livro(777, "Água Viva", "Clarice Lispector", 1973, 7, 10.0)
    val livro8 = Livro(888, "Laços de Família", "Clarice Lispector", 1960, 8, 6.0)

    // Coleções de livros para testes
    val colecaoA = listOf(livro5, livro6)
    val colecaoB = listOf(livro7, livro8)

    val colecao1 = Colecao(11, 11.0, "Mix de Aluísio de Azevedo", colecaoA, 1)
    val colecao2 = Colecao(22, 16.0, "Mix de Clarice Lispector", colecaoB, 1)

    // Cadastrar livros e coleções
    val sistema = Sistema()

    sistema.cadastrar(livro1, livro2, livro3, livro4)

    sistema.cadastrar(colecao1, colecao2)

    // Consultar livros e coleções
    sistema.consultar(livro1)
    sistema.consultar(colecao1)

    // Vender livros e coleções
    sistema.efetuarVenda(livro1)
    sistema.efetuarVenda(colecao1)
}