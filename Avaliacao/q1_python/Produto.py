class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def mostra_info(self):
        print(f"Produto: {self.nome}")
        print(f"Preco: {self.preco}")