

num = input("Digite um número binário: ")
n = len(num) - 1
decimal = 0

for d in num:
    decimal = decimal + int(d)*2**n
    n = n - 1

print("O binário  %s equivale a %d na base decimal." %(num, decimal))