soma_positivos = 0
soma_negativos = 0

# Entrada de dados
while True:
    entrada = input("Digite um número ou 'fim' para encerrar o programa: ")
    if entrada == 'fim':
        break
    numero = int(entrada)
    if numero > 0:
        soma_positivos += numero
    else:
        soma_negativos += numero

soma_total = soma_positivos + soma_negativos

# Saída de dados
print(f"Soma dos números positivos: {soma_positivos}")
print(f"Soma dos números negativos: {soma_negativos}")
print(f"Soma total: {soma_total}")