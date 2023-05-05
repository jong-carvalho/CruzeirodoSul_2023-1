
def exibirMensagens():
    print("Olá, tudo bem?")
    print("Estou no método ... ")

exibirMensagens()
print("Até logo")


def spam(x):
    return x, x, x, x

print(spam('spam'))


#pode conter múltiplos retornos
def retornaValor(x):
    return x, 2*x, 3*x, x+1, x**2

#retorna todos os valores de retorno
print(retornaValor(5))

a = retornaValor(4)
