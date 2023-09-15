minutos = int(input('Qual os minutos mostrados no horario da maquina?'))
fatorial = 1

for x in range(1,minutos + 1): 
    fatorial = fatorial * x

print(f'LIBERDADE{fatorial}')
