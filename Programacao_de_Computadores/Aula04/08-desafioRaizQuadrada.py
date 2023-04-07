import math

num = float(input('Digite um número qualquer: '))

if num > 0:
    r = math.sqrt(num)
    print('A raiz quadrada de %.2f é %.2f' % (num, r))
else:
    print('Em R, não há raiz quadrada de número negativo')