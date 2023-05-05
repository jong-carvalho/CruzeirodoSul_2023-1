

qtdMasc=0
qtdFem=0
idadeM=0
idadeF=0

while qtdMasc < 5:
    sexo = input("Digite seu sexo: ")
    nome = input("Digite seu nome: ")
    idade = int(input("Digite sua idade: "))

    if sexo.lower()[0] == "m":
        qtdMasc+=1
        idadeM+=idade
    elif sexo.lower()[0] == "f":
        qtdFem+=1
        idadeF+=idade
    else:
        print("Sexo inválido")

print(f"Média de idades sexo Masculino"
      f" {idadeM/qtdMasc} ")
# print("Média de idade sexo Feminino %"
#       %(idadeF/qtdFem))
# print("Média de idades ",
#       (idadeM + idadeF)/(qtdMasc+qtdFem))