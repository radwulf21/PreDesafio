package predesafio1

data class Livro(override var codigo: Int, var titulo: String, var autor: String, var anoLancamento: Int, override var preco: Double) : Item