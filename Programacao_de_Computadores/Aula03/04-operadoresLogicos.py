

# Tabela verdade do AND
print(True and True)
print(True and False)
print(False and True)
print(False and False)


# Tabela verdade do OR
print(True or True)
print(True or False)
print(False or True)
print(False or False)

# Tabela verdade do XOR (exclusivamente tem que ser um ou outro)
print(True != True)
print(True != False)
print(False != True)
print(False != False)

# Operador de Negação (Unário)
print('Operador de Negação (Unário)')
print(not True)
print(not False)

# 0 é false em Python
print(not 0)
# qualquer número diferente de zero é true
print(not 1)

p1 = input('É menino? ')
p2 = input('É menina? ')

tv55 = eval(p1) and eval(p2)

print(tv55)