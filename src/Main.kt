fun main() {
    val faturamentoPorEstado = mapOf(
        "SP" to 67836.43,
        "RJ" to 36678.66,
        "MG" to 29229.88,
        "ES" to 27165.48,
        "Outros" to 19849.53
    )

    val totalFaturamento = faturamentoPorEstado.values.sum()

    println("Percentual de representação por estado:")
    for ((estado, faturamento) in faturamentoPorEstado) {
        val percentual = (faturamento / totalFaturamento) * 100
        println("Estado: $estado - Percentual: %.2f%%".format(percentual))
    }
}
