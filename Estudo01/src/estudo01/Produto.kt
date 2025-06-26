package estudo01

class Produto(
    val nome: String,
    val preco: Double,
    val quantidade: Int
) {
    fun calcularValorTotal(): Double {
        val total = preco * quantidade
        val desconto = if (quantidade <= 10) {
            0.0
        } else if (quantidade >= 11 && quantidade <= 20) {
            total * 0.1
        } else if (quantidade >= 21 && quantidade <= 50) {
            total * 0.2
        } else {
            total * 0.25
        }
        return total - desconto
    }
}
