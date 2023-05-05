# Inicializa as variáveis de contagem
homens_idosos = 0
mulheres_jovens = 0

# Solicita a entrada do usuário para cada pessoa
while True:
    sexo = input("Informe o sexo da pessoa (M ou F), ou digite 'S' para sair: ")

    # Verifica se o usuário deseja sair do programa
    if sexo.upper() == "S":
        break

    idade = int(input("Informe a idade da pessoa: "))

    # Verifica se a pessoa atende às condições de contagem
    if sexo.upper() == "M" and idade > 80:
        homens_idosos += 1
    elif sexo.upper() == "F" and idade < 20:
        mulheres_jovens += 1

# Exibe o resultado da contagem
if homens_idosos > 0:
    print(f"Quantidade de homens com mais de 80 anos: {homens_idosos}")
elif mulheres_jovens > 0:
    print(f"Quantidade de mulheres com menos de 20 anos: {mulheres_jovens}")
else:
    print("Não possuímos pessoas com os parâmetros exigidos.")