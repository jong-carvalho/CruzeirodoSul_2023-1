
import soma, subtracao, mutiplicacao, divisao


x = float(input("Entre com 1o valor: "))
y = float(input("Entre com 2o valor: "))
op = input("Escolha a operação (+, -, *, / ): ")

if(op == '+'):
    print("A soma dos valores é ", soma.soma(x, y))
elif(op == '-'):
    print("A subtração dos valores é ", subtracao.subtracao(x, y))
elif(op == '*'):
    print("A multiplicação dos valores é ", mutiplicacao.multiplicacao(x, y))
elif(op == '/'):
    print("A divisão dos valores é ", divisao.divisao(x, y))
else:
    print("Provavelmente você digitou alguma coise errada, reinicie o programa!")