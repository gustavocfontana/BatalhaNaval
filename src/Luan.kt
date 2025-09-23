class Luan {
    fun verificacaoDeJogadas(jogadas: List<Pair<Int, Int>>, tamanho: Int): Pair<Int, Int> {
        while (true) {
            println("Selecione uma linha: ")
            val linha = readln().toIntOrNull()
            println("Selecione uma coluna: ")
            val coluna = readln().toIntOrNull()

            // Verificação antes de usar os valores
            if (linha == null || coluna == null || linha !in 0 until tamanho || coluna !in 0 until tamanho) {
                println("Opção inválida, tente novamente!")
                continue
            }

            val tentativas = linha to coluna

            if (tentativas in jogadas) {
                println("Você já selecionou essa posição, tente novamente!")
                continue
            }

            return tentativas
        }
    }
}