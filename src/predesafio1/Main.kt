package predesafio1

fun main(){

    val livro1 = Livro(111, "Livro Um", "Autor A", 2019, 1, 11.0)
    val livro2 = Livro(222, "Livro Dois", "Autor A", 2020, 2,)
    val livro3 = Livro(333, "Livro Três", "Autor B", 2000, 3)
    val livro4 = Livro(444, "Livro Quatro", "Autor B", 2010,4)
    val livro5 = Livro(555, "Livro Cinco", "Autor C", 2000, 5)
    val livro6 = Livro(666, "Livro Seis", "Autor C", 2015, 6)
    val livro7 = Livro(777, "Livro Sete", "Autor D", 2008, 7)
    val livro8 =Livro(888, "Livro Oito", "Autor D", 2018, 8)


    val listaA = listOf(livro1, livro2)
    val listaB =  listOf(livro3, livro4)
    val listaC =  listOf(livro5)
    val listaD =  listOf(livro7)
    val listaC1 = listOf(livro6)
    val listaD1 = listOf(livro8)


    val colecaoA = Colecao(11, 50.99, "Livros do Autor A",listaA)
    val colecaoB = Colecao(22, 100.00, "Livros do Autor B",listaB)
    val colecaoC = Colecao(33, 80.99, "Livros do Autor C",listaC)
    val colecaoD = Colecao(44, 70.00, "Livros do Autor D",listaD)

    //cadastro livros nas coleções
    colecaoC.cadastrar(listaC1)
    colecaoD.cadastrar(listaD1)


    //consultar coleção
    colecaoA.consultar(colecaoA.codigo)

    //vender coleção
    colecaoB.efetuarVenda(colecaoB.codigo)
}