fun main() { // Pedro, Gustavo Fontana, Gabriel Francisco, Henry, Luan
    val pedro = Pedro()
    val gabriel = Gabriel()
    val gustavo = Gustavo()
    val henry = Henry()
    val luan = Luan()

    do {
        jogarBatalhaNaval(pedro, gabriel, gustavo, henry, luan)
    } while (henry.pergunta())
}

fun jogarBatalhaNaval(pedro: Pedro, gabriel: Gabriel, gustavo: Gustavo, henry: Henry, luan: Luan) {
    val tamanhoTabuleiro = 10
    val totalTentativas = 15
    var pontos = 0
    var tentativasUsadas = 0

    val tabuleiro = pedro.criarTabuleiro(tamanhoTabuleiro)
    val naviosOriginais = gabriel.posicionarNavios(tabuleiro).toMutableList()
    val naviosRestantes = naviosOriginais.toMutableList()
    val jogadas = mutableListOf<Pair<Int, Int>>()

    println("BATALHA NAVAL")
    println("Você tem $totalTentativas tentativas para afundar os navios!")
    println("Frota inimiga: 10 Porta-aviões, 1 Cruzador, 2 Rebocadores")

    for (tentativa in 1..totalTentativas) {
        println("\nTentativa $tentativa de $totalTentativas")
        println("Pontuação atual: $pontos")

        pedro.mostrarTabuleiro(tabuleiro)

        val jogada = luan.verificacaoDeJogadas(jogadas, tamanhoTabuleiro)
        jogadas.add(jogada)
        tentativasUsadas++

        val pontosGanhos = gustavo.verificarTiro(jogada.first, jogada.second, naviosRestantes, tabuleiro)
        pontos += pontosGanhos

        if (naviosRestantes.isEmpty()) {
            println("Parabéns! Você afundou todos os navios!")
            break
        }
    }

    println("\nFIM DO JOGO")
    henry.mostrarmapanofinal(tabuleiro, naviosOriginais, naviosRestantes, pontos)
    henry.mostrarresumo(tentativasUsadas, pontos)
}
