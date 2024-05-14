import numpy as np

ds = np.loadtxt('space.csv', delimiter=';', dtype=str, encoding='utf-8')

#--------------------------------------------------------------------------------------------#
print("Porcentagem de missões que deram certo: ")
success = ds[ds[:,7] == 'Success']
print(f'{(len(success)/(len(ds)-1))*100:,.2f}% das missoes deram certo')

#-----------------------------------------------------------------------------------------------#

print("Media de gastos das missões com custo >0: ")
cost = ds[1:,6].astype(np.float64)
print(f'{np.mean(cost[cost>0]):,.2f}')

#-----------------------------------------------------------------------------------------------#

print('Custo da missao mais cara realizada pela SpaceX:')
spacex = ds[ds[:,1] == 'SpaceX']
valores_spacex = spacex[:,6].astype(float)
print(np.max(valores_spacex))