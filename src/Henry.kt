class Henry {
    object ConsoleColors {
        const val reset = "\u001B[0m"
        const val red = "\u001B[31m"
        const val green = "\u001B[32m"
        const val blue = "\u001B[34m"
    }

    fun mostrarmapanofinal(tabuleiro: Array<Array<String>>, naviosOriginais: MutableList<Pair<String, Pair<Int, Int>>>, naviosRestantes: MutableList<Pair<String, Pair<Int, Int>>>, pontuacao: Int) {
        println("\n=== MAPA FINAL ===")
        println("   0 1 2 3 4 5 6 7 8 9")

        for (i in tabuleiro.indices) {
            print("$i  ")
            for (j in tabuleiro[i].indices) {
                val posicao = i to j
                val navioOriginal = naviosOriginais.find { it.second == posicao }
                val navioRestante = naviosRestantes.find { it.second == posicao }

                when {
                    tabuleiro[i][j] == "X" && navioOriginal != null -> {
                        when (navioOriginal.first) {
                            "P" -> print("${ConsoleColors.red}P ${ConsoleColors.reset}")
                            "C" -> print("${ConsoleColors.red}C ${ConsoleColors.reset}")
                            "R" -> print("${ConsoleColors.red}R ${ConsoleColors.reset}")
                        }
                    }
                    navioRestante != null -> {
                        when (navioRestante.first) {
                            "P" -> print("${ConsoleColors.blue}P ${ConsoleColors.reset}")
                            "C" -> print("${ConsoleColors.blue}C ${ConsoleColors.reset}")
                            "R" -> print("${ConsoleColors.blue}R ${ConsoleColors.reset}")
                        }
                    }
                    tabuleiro[i][j] == "O" -> print("${ConsoleColors.green}~ ${ConsoleColors.reset}")
                    else -> print("~ ")
                }
            }
            println()
        }
        println("\nPontuação final: $pontuacao pontos no total")
    }

    fun mostrarresumo(tentativas: Int, pontuacao: Int)
    {
        print("REsUMO DA PARTIDA")
        print("\nnumero de tentativas: $tentativas")
        print("\nPontuação final: $pontuacao")
        print("\nObrigado por jogar!")
    }

    fun pergunta(): Boolean
    {
        print("Quer jogar de novo? |sim = 1|nao = 2|")
        val resposta = readLine()!!.toInt()
        return resposta == 1
    }
}