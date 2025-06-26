package estudo01

fun main() {
    val primeiroProduto = Produto("Notebook", 2500.0, 15)
    val segundoProduto = Produto("Smartphone", 1500.0, 25)

    println("Valor total do primeiro produto: R$ ${primeiroProduto.calcularValorTotal()}")
    println("Valor total do segundo produto: R$ ${segundoProduto.calcularValorTotal()}")
}
