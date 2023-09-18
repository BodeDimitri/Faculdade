def CalcularVM(distancia, tempo):
    velocidadeMedia = distancia/tempo
    return velocidadeMedia

print(CalcularVM(5,10))

#####################################

def CalcularVM2():
    distancia = float(input("Digite a distância percorrida"))
    tempo = float(input("Digite o tempo da viagem"))

    velocidadeMedia = distancia/tempo

    return print(f'A velocidade média e de {velocidadeMedia} Km/H')

CalcularVM2()