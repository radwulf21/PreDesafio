package predesafio1

data class Colecao(override var codigo:Int, override var preco: Double, var descricao: String, var colecao: List<Livro>):Item{

}