soma_pares = 0
soma_impares = 0
quantidade = 0
num_impares = 0

while num_impares < 3:
    numero = int(input("Digite um número: "))
    quantidade += 1

    if numero % 2 == 0:
        soma_pares += numero
    else:
        soma_impares += numero
        num_impares += 1

soma_total = soma_pares + soma_impares

print("A soma dos números pares é:", soma_pares)
print("A soma dos números ímpares é:", soma_impares)
print("A soma de todos os números é:", soma_total)
print("A quantidade de números inseridos é:", quantidade)