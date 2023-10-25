import json

arquivo = open('./dicionario1.json', 'r', encoding='UTF-8')

conteudo = arquivo.read()
agenda = json.loads(conteudo)
print(type(agenda))