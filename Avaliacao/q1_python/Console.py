from Produto import Produto

class Console(Produto):
    def __init__(self, nome, preco, geracao, marca):
        super().__init__(nome, preco)
        self.geracao = geracao
        self.marca = marca

    def mostra_info(self):
        super().mostra_info()
        print(f"Geracao: {self.geracao}")
        print(f"Marca: {self.marca}")

    def jogar(self):
        print("Carregando o jogo...")
        print("Jogo iniciou")