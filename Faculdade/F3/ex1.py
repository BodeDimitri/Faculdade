arquivo = open("./Text.txt")

#print(arquivo.read())
#print(arquivo.readlines())

for linha in arquivo.readlines():
    print(linha) 

arquivo.close()