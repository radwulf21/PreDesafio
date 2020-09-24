package predesafio1

import java.util.*

fun main() {

    // Livros para testes
    val livro1 = Livro(111, "Dom Casmurro", "Machado de Assis", 1899, 0, 11.0)
    val livro2 = Livro(222, "O Alienista", "Machado de Assis", 1882, 2, 12.0)
    val livro3 = Livro(333, "Iracema", "José de Alencar", 1865, 3, 15.0)
    val livro4 = Livro(444, "A Hora da Estrela", "Clarice Lispector", 1977, 4, 9.0)
    val livro5 = Livro(555, "O Mulato", "Aluísio Azevedo", 1881, 5, 5.0)
    val livro6 = Livro(666, "O Cortiço", "Aluísio Azevedo", 1890, 6, 6.0)
    val livro7 = Livro(777, "Água Viva", "Clarice Lispector", 1973, 7, 10.0)
    val livro8 = Livro(888, "Laços de Família", "Clarice Lispector", 1960, 8, 6.0)

    // Coleções de livros para testes
    val colecaoA = listOf(livro5, livro6)
    val colecaoB = listOf(livro7, livro8)

    val colecao1 = Colecao(11, 11.0, "Mix de Aluísio de Azevedo", colecaoA, 1)
    val colecao2 = Colecao(22, 16.0, "Mix de Clarice Lispector", colecaoB, 1)


    val sistema = Sistema()

    var res = 0

    while (res == 0) {
        println("\n")
        println("<---------- MENU ---------->")
        println("Informe a opção que deseja:")
        println("1 - Cadastrar livro")
        println("2 - Cadastrar coleção")
        println("3 - Consultar livro")
        println("4 - Consultar coleção")
        println("5 - Efetuar venda de livro")
        println("6 - Efetuar venda de coleção")
        println("(N) - Sair do menu ")
        println("\n")
        val scanner = Scanner(System.`in`)
        var opcao = scanner.next()

        when (opcao) {
            "1" -> {
                println("<---------- CADASTRO DE LIVRO ---------->")
                println("Cadastrando ${livro1.titulo}, ${livro2.titulo}, ${livro3.titulo} e ${livro4.titulo}.")
                sistema.cadastrar(livro1, livro2, livro3, livro4)
            }

            "2" -> {
                println("<---------- CADASTRO DE COLEÇÃO ---------->")
                println("Cadastrando ${colecao1.descricao} e ${colecao2.descricao}.")
                sistema.cadastrar(colecao1, colecao2)
            }

            "3" -> {
                println("<---------- CONSULTA DE LIVRO ---------->")
                println("Consultando ${livro1.titulo}.")
                sistema.consultar(livro1)
            }

            "4" -> {
                println("<---------- CONSULTA DE COLEÇÃO ---------->")
                println("Consultando ${colecao1.descricao}.")
                sistema.consultar(colecao1)
            }

            "5" -> {
                println("<---------- VENDA DE LIVRO ---------->")
                println("Efetuando venda de ${livro1.titulo}.")
                sistema.efetuarVenda(livro1)
            }

            "6" -> {
                println("<---------- VENDA DE COLEÇÃO ---------->")
                println("Efetuando venda de  ${colecao1.descricao}.")
                sistema.efetuarVenda(colecao1)
            }

            "N" -> {
                res = 1
                println("Você saiu do menu.")
            }

            else -> println("Opção inválida!")
        }

    }

}