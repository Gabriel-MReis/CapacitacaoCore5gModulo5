import pandas as pd

# Carregar o dataset
df = pd.read_csv('vendas.csv',delimiter=';')

# Limpar os valores monetários e converter para números
df['Valor Unitário'] = df['Valor Unitário'].str.replace('R$', '').str.replace(',', '').astype(float)
df['Valor Final'] = df['Valor Final'].str.replace('R$', '').str.replace(',', '').astype(float)

# Faturamento de cada loja
faturamento_por_loja = df.groupby('ID Loja')['Valor Final'].sum()

# Quantidade de produtos vendidos de cada loja
quantidade_por_loja = df.groupby('ID Loja')['Quantidade'].sum()

# Ticket médio dos produtos de cada loja
ticket_medio_por_loja = df.groupby('ID Loja')['Valor Final'].mean()

# Mostrar os resultados
print('Faturamento por loja:')
print(faturamento_por_loja)
print('\nQuantidade de produtos vendidos por loja:')
print(quantidade_por_loja)
print('\nTicket médio dos produtos por loja:')
print(ticket_medio_por_loja)
