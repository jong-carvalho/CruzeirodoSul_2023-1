
animais = ['gato', 'cachorro', 'leão', 'camelo']

for a in animais:
    print("A palavra", a, "tem um tamnho: ", len(a))

print("________________________________________________")

sequencia = [0, 1, 2, 3, 4, 5]

for num in sequencia:
    print(num)

print("________________________________________________")

nome =  "aline"

for letra in nome:
    print(letra)

print("________________________________________________")

# sempre que damos o print ele imprime em nova linha, o comando end vai mudar esse comportamento
for i in range(10):
    print(i, end=" ")

print("\n________________________________________________")

for i in range(3, 8):
    print(i, end=" ")

print("\n________________________________________________")

for i in range(0, 21, 2):
    print(i, end=" ")

print("\n________________________________________________")

for i in range(5, 20, 3):
    print(i, end=" ")