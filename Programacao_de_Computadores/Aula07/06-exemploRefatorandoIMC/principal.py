import metodos

peso = float(input("Digite o peso da pessoa, em Kg: "))
altura = float(input("Digite a estatura da pessoa, em m: "))
print("O IMC é ", metodos.imc(peso, altura), " Kg/m2")
metodos.despedida()