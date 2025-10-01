# 🚢 Batalha Naval

## ⚙️ Configuração do Jogo

### 🎯 Tabuleiro
- Crie uma grade de **10x10**

### 🚢 Frota Oculta
O programa deve posicionar aleatoriamente os seguintes navios no tabuleiro, garantindo que não se sobreponham:
- **10** porta-aviões ✈️
- **01** cruzador 🚢
- **02** rebocadores 🚤

### 🎮 Turnos
- O jogador terá **15 tentativas** (turnos) para lançar bombas

## 🎲 Lógica do Jogo

### 📍 Entrada do Jogador
- A cada turno, o jogador deve inserir as coordenadas (**não repetidas**) para lançar a bomba

### 📊 Feedback Visual e Pontuação

#### ✈️ Atingiu um Porta-aviões
- Adicione **5 pontos**
- Coloque na posição um porta-aviões destacado de **🔴 VERMELHO**
- Exiba a mensagem: *"Alvo atingido! Porta-aviões abatido!"*

#### 🚢 Atingiu um Cruzador
- Adicione **15 pontos**
- Coloque na posição um cruzador destacado de **🔴 VERMELHO**
- Exiba a mensagem: *"Alvo atingido! Cruzador abatido!"*

#### 🚤 Atingiu um Rebocador
- Adicione **10 pontos**
- Coloque na posição um rebocador destacado de **🔴 VERMELHO**
- Exiba a mensagem: *"Alvo atingido! Rebocador abatido!"*

#### 🌊 Água (não atingiu nada)
- Marque a posição no mapa com **🟢 VERDE**
- Forneça uma dica de proximidade baseada na distância até o navio mais próximo:
  - **1** - Errou, mas está a 1 casa de distância
  - **2** - Errou, mas está a 2 casas de distância
  - **3** - Errou, mas está a 3 casas de distância
  - **M** - Errou por muito, distância maior que 3

## 🏁 Final do Jogo

Após as **15 tentativas**, o programa deve exibir o placar final e um resumo completo da partida.

### 🗺️ Revelar Mapa
- Mostre a posição de todos os navios no tabuleiro
- Destaque os navios abatidos em **🔴 VERMELHO** e os restantes em **🔵 AZUL**
- Mostre todas as posições onde bombas foram lançadas, usando **🟢 VERDE** para as que erraram

### 🏆 Placar
- Exiba a pontuação total do jogador

### 🔄 Opções
- Ofereça ao jogador a escolha de **Jogar Novamente** ou **Sair**

---

## 👥 Alunos
- Pedro
- Henry
- Gustavo Fontana
- Gabriel Francisco
- Luan

---

### 📝 Licença
[Adicione aqui a licença do projeto, se aplicável]
