

#Desafio média do aluno
nota1 = float(input("Digite a 1a nota: "))
nota2 = float(input("Digite a 2a nota: "))
media = (nota1+nota2)/2
nome = input("Digite o nome: ")
disciplina = input("Digite o nome da disciplina: ")
print("Nome do aluno: ", nome)
print("Disciplina: ", disciplina)
print("Primeira nota:  %.2f \nSegunda nota: %.2f" %(nota1, nota2))
print("Média: ", media)