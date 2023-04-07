

media = float(input("Digite a média:"))
frequencia = int(input("Digite o percentual de frequência:"))

if frequencia < 75:
    print("Reprovado por falta")
elif media < 6:
        print("Reprovado por nota")
else:
    print("Aprovado")