from Produto import Produto

class Notebook(Produto):
    def __init__(self, nome, preco, processador, memoria):
        super().__init__(nome, preco)
        self.processador = processador
        self.memoria = memoria

    def mostra_info(self):
        super().mostra_info()
        print(f"Processador: {self.processador}")
        print(f"Memoria: {self.memoria}")

    def instalar_aplicativo(self):
        print("Instalando aplicativo...")