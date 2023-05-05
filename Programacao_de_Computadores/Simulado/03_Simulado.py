pares = 0
impares = 0
qtd_impares = 0
soma_total = 0
numeros_inseridos = 0

while True:
    numeros_inseridos += 1
    
    num = int(input("Digite um número: "))
    soma_total += num

    if num % 2 == 0:
        pares += num
    else:
        impares += num
        qtd_impares += 1

    if qtd_impares == 3:
        print("Você digitou 3 números ímpares. Encerrando o programa...")
        break

    continuar = input("Deseja inserir um número? (s/n)")
    if continuar.lower() == "n":
        break

print("Soma dos números pares:", pares)
print("Soma dos números ímpares:", impares)
print("Soma total dos números:", soma_total)
print("Quantidade de números inseridos:", numeros_inseridos)