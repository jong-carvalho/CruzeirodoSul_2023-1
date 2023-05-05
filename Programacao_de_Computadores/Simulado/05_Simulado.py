a = float(input("Digite o valor de A: "))
b = float(input("Digite o valor de B: "))
c = float(input("Digite o valor de C: "))

# Imprime na ordem lida
print("Valores lidos: ", a, b, c)

# Imprime em ordem crescente
if a <= b <= c:
    print("Valores em ordem crescente: ", a, b, c)
elif a <= c <= b:
    print("Valores em ordem crescente: ", a, c, b)
elif b <= a <= c:
    print("Valores em ordem crescente: ", b, a, c)
elif b <= c <= a:
    print("Valores em ordem crescente: ", b, c, a)
elif c <= a <= b:
    print("Valores em ordem crescente: ", c, a, b)
else:
    print("Valores em ordem crescente: ", c, b, a)

# Imprime em ordem decrescente
if a >= b >= c:
    print("Valores em ordem decrescente: ", a, b, c)
elif a >= c >= b:
    print("Valores em ordem decrescente: ", a, c, b)
elif b >= a >= c:
    print("Valores em ordem decrescente: ", b, a, c)
elif b >= c >= a:
    print("Valores em ordem decrescente: ", b, c, a)
elif c >= a >= b:
    print("Valores em ordem decrescente: ", c, a, b)
else:
    print("Valores em ordem decrescente: ", c, b, a)