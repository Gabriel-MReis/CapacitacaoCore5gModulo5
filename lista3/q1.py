nome = input('Insira seu nome: ')

print(nome.upper())
print(nome.lower())
print(len(nome))

i = nome.rfind(' ')
nome_inatel = nome[0:i] + ' do Inatel'

print(nome_inatel)
