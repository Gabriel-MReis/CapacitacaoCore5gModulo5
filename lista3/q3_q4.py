import numpy as np
np.random.seed(10)

mat = np.random.randint(1,5,[4,4])

print(mat)

valores, contagens = np.unique(mat, return_counts=True)

contagem = dict(zip(valores, contagens))

print("\nQuantidade de aparições de cada número:")
for num, qtde in contagem.items():
    print(f"Número {num}: {qtde} vezes")

print("\nNúmeros que aparecem 2 vezes:")
for num, qtde in contagem.items():
    if qtde == 2:
        print(num)