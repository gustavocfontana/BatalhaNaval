class Gustavo {

    fun verificarTiro(linha: Int, coluna: Int, navios: MutableList<Pair<String, Pair<Int, Int>>>, tabuleiro: Array<Array<String>>): Int {
        val posicaoTiro = linha to coluna

        for (navio in navios) {
            val tipoNavio = navio.first
            val posicaoNavio = navio.second

            if (posicaoNavio == posicaoTiro) {
                tabuleiro[linha][coluna] = "X"
                navios.remove(navio)

                if (tipoNavio == "P") {
                    println("Alvo atingido! Porta-aviões abatido!")
                    return 5
                }
                if (tipoNavio == "C") {
                    println("Alvo atingido! Cruzador abatido!")
                    return 15
                }
                if (tipoNavio == "R") {
                    println("Alvo atingido! Rebocador abatido!")
                    return 10
                }
            }
        }

        tabuleiro[linha][coluna] = "O"

        val distancia = calcularProximidade(linha, coluna, navios)
        if (distancia == 1) {
            println("1 - Errou, mas está a 1 casa de distância")
        } else if (distancia == 2) {
            println("2 - Errou, mas está a 2 casas de distância")
        } else if (distancia == 3) {
            println("3 - Errou, mas está a 3 casas de distância")
        } else {
            println("M - Errou por muito, distância maior que 3")
        }

        return 0
    }

    fun calcularProximidade(linha: Int, coluna: Int, navios: MutableList<Pair<String, Pair<Int, Int>>>): Int {
        var menorDistancia = 100

        for (navio in navios) {
            val linhaNav = navio.second.first
            val colunaNav = navio.second.second

            val distanciaLinha = if (linha > linhaNav) linha - linhaNav else linhaNav - linha
            val distanciaColuna = if (coluna > colunaNav) coluna - colunaNav else colunaNav - coluna
            val distanciaTotal = distanciaLinha + distanciaColuna

            if (distanciaTotal < menorDistancia) {
                menorDistancia = distanciaTotal
            }
        }

        return menorDistancia
    }
}