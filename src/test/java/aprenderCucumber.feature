#language: pt
Funcionalidade: Aprender Cucumber
    Como um aluno
    Eu quero aprender a utlizar o cucumber
    Para que eu possa automatizar critérios de aceitação

Cenário: Deve executar especificação
Dado que criei o arquivo corretamente
Quando executá-lo
Então a especificação deve finalizar com sucesso


Cenário: Deve implementar contador
Dado que o valor é 15
Quando incrementar em 3
Então o valor do contador será 18

Cenário: Deve implementar contador
Dado que o valor é 123
Quando incrementar em 35
Então o valor do contador será 158

Cenario: Deve calcular atraso na entrega
Dado que a entrega é dia 05/04/2018
Quando a entrega atrasar 2 dias
Então a entrega será efetuada em 07/04/2018

Cenario: Deve calcular atraso na entrega da China
Dado que a entrega é dia 05/04/2018
Quando a entrega atrasar 2 meses
Então a entrega será efetuada em 05/06/2018

Cenario: Deve criar steps genéricos para estes passos
    Dado que o ticket é AF345
    Dado que o valor da passagem é R$ 230,45
    Dado que o nome do passageiro é "Fulano da Silva"
    Dado que o telefone do passageiro é 9999-9999
    Quando criar os steps
    Então o teste vai funcionar