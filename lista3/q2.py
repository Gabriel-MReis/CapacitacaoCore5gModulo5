nome = input('Nome: ')
media = float(input('Media: '))

aluno = {
    'nome': nome,
    'media': media
}

if media > 60:
    aluno['situacao'] = 'AP'
else: 
    aluno['situacao'] = 'RP'

for key, value in aluno.items():
    print(f'{key}: {value}')