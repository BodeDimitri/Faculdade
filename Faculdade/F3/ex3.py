import json

exemplo = {
    "livro": {
        "titulo": "Crime e Castigo",
        "ano_publicacao": 1866
    },
    "personagens": [
        {
            "nome": "Raskólnikov",
            "idade": 23,
            "profissao": "estudante",
            "atributos": ["inteligente", "atormentado"]
        },
        {
            "nome": "Sônia Marmieládov",
            "idade": 20,
            "profissao": "prostituta",
            "atributos": ["bondosa", "altruísta"]
        },
        {
            "nome": "Porfíri Petrovitch",
            "idade": 45,
            "profissao": "inspetor de polícia",
            "atributos": ["astuto", "perspicaz"]
        }
    ]
}

#print(json.dumps(exemplo, indent=4))

arquivo = open('./dicionario.json', 'w', encoding='UTF-8')
conteudo = json.dumps(exemplo, indent=4)

arquivo.write(conteudo)
arquivo.close()