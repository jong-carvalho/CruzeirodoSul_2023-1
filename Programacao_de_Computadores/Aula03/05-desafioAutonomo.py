
# converter input para número para mostrar funcionando com valeros 0 e 1
trabalhoSegunda = input('João trabalhou na segunda? ')
trabalhoQuarta = input('João trabalhou na quarta? ')
trabalhoSexta = input('João trabalhou na sexta? ')

print(bool(trabalhoSegunda))
print(bool(trabalhoQuarta))
print(bool(trabalhoSexta))

tv55 = bool(trabalhoSegunda) and bool(trabalhoQuarta) and bool(trabalhoSexta)
print(f'Posso comprar uma tv 55 polegadas 4k? {tv55}')

tv32 = trabalhoSegunda and trabalhoQuarta or trabalhoSexta
print(f'Posso comprar uma tv 32 polegadas? {tv32}')

tvTubo = trabalhoSegunda or trabalhoQuarta or trabalhoSexta
print(f'Posso comprar uma tv de Tubo? {tvTubo}')
