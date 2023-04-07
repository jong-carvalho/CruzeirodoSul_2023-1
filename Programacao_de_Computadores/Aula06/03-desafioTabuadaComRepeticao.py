
num = int(input("Digite um número inteiro: "))

for i in range(11):
    print("%d * %d = %d" %(num, i, num*i))

for i in range(10):
    print("%d * %d = %d" % (num, i + 1, num * (i + 1)))