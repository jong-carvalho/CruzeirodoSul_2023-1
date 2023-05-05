# Inicializa a variável de controle do laço
contador = 1

# Inicializa a variável que armazenará a soma das compras
total_compras = 0

# Recebe o valor das compras dos 5 clientes utilizando um laço de repetição
while contador <= 5:
    compra = float(input("Digite o valor da compra do cliente %d: " % contador))
    total_compras += compra
    contador += 1

# Verifica se o faturamento da filial é maior do que o da matriz
faturamento_matriz = 54000
if total_compras > faturamento_matriz:
    # Calcula em quanto por cento a filial ultrapassou a matriz
    percentual_ultrapassagem = ((total_compras - faturamento_matriz) / faturamento_matriz) * 100
    print("A filial ultrapassou a matriz em %.2f%%" % percentual_ultrapassagem)
else:
    print("A filial não ultrapassou a matriz.")