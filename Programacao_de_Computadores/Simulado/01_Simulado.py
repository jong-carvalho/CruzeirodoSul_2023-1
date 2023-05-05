# Inicialização das variáveis contadoras
masc_s = 0  # quantidade de homens que responderam "sim"
fem_n = 0  # quantidade de mulheres que responderam "não"
total_s = 0  # quantidade total de pessoas que responderam "sim"
total_n = 0  # quantidade total de pessoas que responderam "não"

# Loop para ler as respostas dos 10 entrevistados
for i in range(10):
    sexo = input("Digite o sexo (M ou F) do entrevistado {}: ".format(i + 1))
    resposta = input("O entrevistado {} gostou do produto? (S ou N) ".format(i + 1))

    # Verifica a resposta e atualiza as variáveis contadoras
    if resposta == "S":
        total_s += 1
        if sexo == "M":
            masc_s += 1
    elif resposta == "N":
        total_n += 1
        if sexo == "F":
            fem_n += 1

# Exibe os resultados
print("Quantidade de homens que responderam 'sim':", masc_s)
print("Quantidade de mulheres que responderam 'não':", fem_n)
print("Quantidade total de pessoas que responderam 'sim':", total_s)
print("Quantidade total de pessoas que responderam 'não':", total_n)