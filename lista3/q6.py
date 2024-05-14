import pandas as pd
import numpy as np

df = pd.read_csv('paises.csv', delimiter=';')
 
region = df['Region']
oceania = df[region.str.contains('OCEANIA',regex=False)]
print(oceania['Country'])

print(np.mean(df['Literacy (%)']))

maxPop = df[df['Population'] == np.max(df['Population'])]
print(maxPop['Country'])
print(maxPop['Region'])

df[df['Coastline (coast/area ratio)'] == 0].to_csv('noCoast.csv', sep=';')
