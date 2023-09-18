segunda = int(input('Votos de segunda-feira: '))
terça = int(input('Votos de terça-feira: '))
quarta = int(input('Votos de quarta-feira: '))
quinta = int(input('Votos de quinta-feira: '))
sexta = int(input('Votos de sexta-feira: '))

if segunda > terça and segunda > quarta and segunda > quinta and segunda > sexta:
    print('Segunda-feira e o dia mais votado')
elif terça > segunda and terça > quarta and terça > quinta and terça > sexta:
    print('Terça-feira e o dia mais votado')
elif quarta > segunda and quarta > terça and quarta > quinta and quarta > sexta:
    print('Quarta-feira e o dia mais votado')
elif quinta > segunda and quinta > terça and quinta > quarta and quinta > sexta:
    print('Quinta-feira e o dia mais votado')
elif sexta > segunda and sexta > terça and sexta > quarta and sexta > quinta:
    print('Sexta-feira e o dia mais votado')
else:
    print('Código inválido')