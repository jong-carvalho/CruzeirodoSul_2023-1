# Recebe o valor das compras dos 5 clientes
compra_1 = float(input("Digite o valor da compra do primeiro cliente: "))
compra_2 = float(input("Digite o valor da compra do segundo cliente: "))
compra_3 = float(input("Digite o valor da compra do terceiro cliente: "))
compra_4 = float(input("Digite o valor da compra do quarto cliente: "))
compra_5 = float(input("Digite o valor da compra do quinto cliente: "))

# Calcula o total das compras
total_compras = compra_1 + compra_2 + compra_3 + compra_4 + compra_5

# Verifica se o faturamento da filial é maior do que o da matriz
faturamento_matriz = 54000
if total_compras > faturamento_matriz:
    # Calcula em quanto por cento a filial ultrapassou a matriz
    percentual_ultrapassagem = ((total_compras - faturamento_matriz) / faturamento_matriz) * 100
    print("A filial ultrapassou a matriz em %.2f%%" % percentual_ultrapassagem)
else:
    print("A filial não ultrapassou a matriz.")