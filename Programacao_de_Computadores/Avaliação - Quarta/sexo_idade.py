sexoM = 0
sexoF = 0
idadeM = 0
idadeF = 0

while sexoM < 5:
    idade = int(input("Digite sua idade:"))
    sexo = input("Digite seu sexo: ")

    if sexo == "m":
        sexoM+=1
        idadeM+=idade
    else:
        sexoF+=1
        idadeF+=idade

print(f"Media das idades sexo masculino {idadeM/sexoM}")
print(f"Media das idades sexo feminino {idadeF/sexoF}")
print(f"Soma das idades {idadeF+idadeM}")