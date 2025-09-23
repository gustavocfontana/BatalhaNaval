import kotlin.random.Random

class Gabriel {
    fun posicionarNavios(tabuleiro: Array<Array<String>>): MutableList<Pair<String, Pair<Int, Int>>> {
        val navios = mutableListOf<Pair<String, Pair<Int, Int>>>() // um array mutável para conter os tipos e posições dos navios, exemplo: [("P", (3, 4)), ("C", (8, 6)), ...]
        val tamanho = tabuleiro.size

        val tiposDeNavio = mapOf(
            "P" to 10, // porta-aviões
            "C" to 1,  // cruzador
            "R" to 2   // rebocador
        )

        val ocupados = mutableSetOf<Pair<Int, Int>>() // garantir que não há sobreposição, guarda coordenadas usadas

        for ((tipo, quantidade) in tiposDeNavio) {
            repeat(quantidade) {
                while (true) {
                    val linha = Random.nextInt(tamanho)
                    val coluna = Random.nextInt(tamanho)
                    val posicao = linha to coluna

                    if (posicao !in ocupados) {
                        ocupados.add(posicao)
                        navios.add(tipo to posicao)
                        break
                    }
                }
            }
        }

        return navios
    }
}