

def soma(a, b):
    result = a + b
    return(result)

def subtracao(a, b):
    result = a - b
    return(result)

def multiplicacao(a, b):
    result = a * b
    return(result)

def divisao(a, b):
    result = a / b
    return(result)

x = float(input("Entre com 1o valor: "))
y = float(input("Entre com 2o valor: "))
op = input("Escolha a operação (+, -, *, / ): ")

if(op == '+'):
    print("A soma dos valores é ", soma(x, y))
elif(op == '-'):
    print("A subtração dos valores é ", subtracao(x, y))
elif(op == '*'):
    print("A multiplicação dos valores é ", multiplicacao(x, y))
elif(op == '/'):
    print("A divisão dos valores é ", divisao(x, y))
else:
    print("Provavelmente você digitou alguma coise errada, reinicie o programa!")