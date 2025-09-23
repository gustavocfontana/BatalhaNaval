class Pedro {
    fun criarTabuleiro(tamanho: Int): Array<Array<String>> {
        return Array(tamanho) { Array(tamanho) { "~" } }
    }

    fun mostrarTabuleiro(tabuleiro: Array<Array<String>>) {
        println("\n   0 1 2 3 4 5 6 7 8 9")
        for (i in tabuleiro.indices) {
            print("$i  ")
            for (j in tabuleiro[i].indices) {
                when (tabuleiro[i][j]) {
                    "X" -> print("X ")
                    "O" -> print("O ")
                    else -> print("~ ")
                }
            }
            println()
        }
    }
}

