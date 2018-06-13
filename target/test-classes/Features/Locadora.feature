#language: pt
Funcionalidade: Alugar Filme
    Como um usuário 
    Eu quero cadastrar aluguéis de filmes 
    Para controlar preços e data de entrega

@primeiro
Cenário: Deve alugar um filme com sucesso
Dado um filme com estoque  de 2 unidades
E que o preço do aluguel seja R$3
Quando alugar
Então o preço do aluguel será R$3
E a data de entrega será no dia seguinte
E o estoque do filme será 1 unidade

#Cenário: Não deve alugar um filme sem estoque
#Dado um filme com estoque de 0 unidade
#Quando alugar
#Então não será possível por falta de estoque 
#E o estoque do filme será 0 unidade
#
#Cenário: Deve dar condições  especiais para categoria extendida
#Dado um filme com estoque de 2 unidades
#E que o preço de aluguel seja R$4
#E que o tipo de aluguel seja extendida
#Quando alugar
#Então o preço do aluguel  será R$8
#E a data de entrega será em 3 dias
#E a pontuação recebida será de 3 pontos