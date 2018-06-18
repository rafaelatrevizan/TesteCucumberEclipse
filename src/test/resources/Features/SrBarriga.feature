#language: pt
@conta
Funcionalidade: Cadastro de contas

Como um usuário 
Gostaria de cadastrar contas
Para que eu possa distribuir meu dinheiro de uma forma mais organizada


Contexto:
Dado que desejo adicionar uma conta

Esquema do Cenário: Deve validar regras de cadastro contas 
Quando adiciono a conta "<nome>"
Então recebo a mensagem "<mensagem>"

Exemplos:
|nome							|mensagem														|
|Conta de teste 	|Conta adicionada com sucesso!			|
|									|Informe o nome da conta						|
|Conta mesmo nome |Já existe uma conta com esse nome! |

#Contexto:
#Dado que estou acessando a aplicação
#Quando informo o usuário "rafaela@infotera.com.br"
#E a senha "@trevizan2018"
#E seleciono entrar
#Então visualizo a página inicial
#Quando seleciono Contas
#E seleciono Adicionar
#
#Esquema do Cenário: Deve validar regras de cadastro contas 
#Quando informo a conta "<nome>"
#E seleciono Salvar
#Então recebo a mensagem "<mensagem>"
#
#Exemplos:
#|nome							|mensagem														|
#|Conta de teste 	|Conta adicionada com sucesso!			|
#|									|Informe o nome da conta						|
#|Conta mesmo nome |Já existe uma conta com esse nome! |


#@contaSucess
#Cenário: Deve inserir uma conta com sucesso
#E informo a conta "Conta de teste"
#E seleciono Salvar
#Então a conta é inserida com sucesso
#
#@contaSemNome
#Cenário: Não deve inserir uma conta sem nome
#E informo a conta ""
#E seleciono Salvar
#Então vou notificar que o nome da conta é obrigatório
#
#@jaexistente
#Cenário: Não deve inserir uma conta com nome já existente 
#E informo a conta "Conta mesmo nome"
#E seleciono Salvar
#Então sou notificado que já existe uma conta com esse nome