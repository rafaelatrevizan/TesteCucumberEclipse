$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SrBarriga.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Cadastro de contas",
  "description": "\r\nComo um usuário \r\nGostaria de cadastrar contas\r\nPara que eu possa distribuir meu dinheiro de uma forma mais organizada",
  "id": "cadastro-de-contas",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@conta"
    }
  ]
});
formatter.scenario({
  "line": 10,
  "name": "Deve inserir uma conta com sucesso",
  "description": "",
  "id": "cadastro-de-contas;deve-inserir-uma-conta-com-sucesso",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 9,
      "name": "@contaSucess"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "informo o usuário \"rafaela@infotera.com.br\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "a senha \"@trevizan2018\"",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "seleciono entrar",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "visualizo a página inicial",
  "keyword": "Então "
});
formatter.step({
  "line": 16,
  "name": "seleciono Contas",
  "keyword": "Quando "
});
formatter.step({
  "line": 17,
  "name": "seleciono Adicionar",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "informo a conta \"Conta de teste\"",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "seleciono Salvar",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "a conta é inserida com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "srBarrigaConta.queEstouAcessandoAAplicação()"
});
formatter.result({
  "duration": 5503578550,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rafaela@infotera.com.br",
      "offset": 19
    }
  ],
  "location": "srBarrigaConta.informoOUsuário(String)"
});
formatter.result({
  "duration": 234617064,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "@trevizan2018",
      "offset": 9
    }
  ],
  "location": "srBarrigaConta.aSenha(String)"
});
formatter.result({
  "duration": 156722090,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.selecionoEntrar()"
});
formatter.result({
  "duration": 674245969,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.visualizoAPáginaInicial()"
});
formatter.result({
  "duration": 78859718,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.selecionoContas()"
});
formatter.result({
  "duration": 129501563,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.selecionoAdicionar()"
});
formatter.result({
  "duration": 381154397,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Conta de teste",
      "offset": 17
    }
  ],
  "location": "srBarrigaConta.informoAConta(String)"
});
formatter.result({
  "duration": 387776602,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.selecionoSalvar()"
});
formatter.result({
  "duration": 540523196,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.aContaÉInseridaComSucesso()"
});
formatter.result({
  "duration": 51968822,
  "status": "passed"
});
formatter.after({
  "duration": 676416945,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Não deve inserir uma conta sem nome",
  "description": "",
  "id": "cadastro-de-contas;não-deve-inserir-uma-conta-sem-nome",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 22,
      "name": "@contaSemNome"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.step({
  "line": 25,
  "name": "informo o usuário \"rafaela@infotera.com.br\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 26,
  "name": "a senha \"@trevizan2018\"",
  "keyword": "E "
});
formatter.step({
  "line": 27,
  "name": "seleciono entrar",
  "keyword": "E "
});
formatter.step({
  "line": 28,
  "name": "visualizo a página inicial",
  "keyword": "Então "
});
formatter.step({
  "line": 29,
  "name": "seleciono Contas",
  "keyword": "Quando "
});
formatter.step({
  "line": 30,
  "name": "seleciono Adicionar",
  "keyword": "E "
});
formatter.step({
  "line": 31,
  "name": "seleciono Salvar",
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "vou notificar que o nome da conta é obrigatório",
  "keyword": "Então "
});
formatter.match({
  "location": "srBarrigaConta.queEstouAcessandoAAplicação()"
});
formatter.result({
  "duration": 3843742171,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rafaela@infotera.com.br",
      "offset": 19
    }
  ],
  "location": "srBarrigaConta.informoOUsuário(String)"
});
formatter.result({
  "duration": 209266257,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "@trevizan2018",
      "offset": 9
    }
  ],
  "location": "srBarrigaConta.aSenha(String)"
});
formatter.result({
  "duration": 139205154,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.selecionoEntrar()"
});
formatter.result({
  "duration": 676342689,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.visualizoAPáginaInicial()"
});
formatter.result({
  "duration": 66767810,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.selecionoContas()"
});
formatter.result({
  "duration": 102223078,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.selecionoAdicionar()"
});
formatter.result({
  "duration": 437204366,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.selecionoSalvar()"
});
formatter.result({
  "duration": 413525260,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.souNotificarQueONomeDaContaÉObrigatório()"
});
formatter.result({
  "duration": 81810097,
  "status": "passed"
});
formatter.after({
  "duration": 651750154,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Não deve inserir uma conta com nome já existente",
  "description": "",
  "id": "cadastro-de-contas;não-deve-inserir-uma-conta-com-nome-já-existente",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 34,
      "name": "@jaexistente"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.step({
  "line": 37,
  "name": "informo o usuário \"rafaela@infotera.com.br\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 38,
  "name": "a senha \"@trevizan2018\"",
  "keyword": "E "
});
formatter.step({
  "line": 39,
  "name": "seleciono entrar",
  "keyword": "E "
});
formatter.step({
  "line": 40,
  "name": "visualizo a página inicial",
  "keyword": "Então "
});
formatter.step({
  "line": 41,
  "name": "seleciono Contas",
  "keyword": "Quando "
});
formatter.step({
  "line": 42,
  "name": "seleciono Adicionar",
  "keyword": "E "
});
formatter.step({
  "line": 43,
  "name": "informo a conta \"Conta de teste\"",
  "keyword": "E "
});
formatter.step({
  "line": 44,
  "name": "seleciono Salvar",
  "keyword": "E "
});
formatter.step({
  "line": 45,
  "name": "sou notificado que já existe uma conta com esse nome",
  "keyword": "Então "
});
formatter.match({
  "location": "srBarrigaConta.queEstouAcessandoAAplicação()"
});
formatter.result({
  "duration": 4084345118,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rafaela@infotera.com.br",
      "offset": 19
    }
  ],
  "location": "srBarrigaConta.informoOUsuário(String)"
});
formatter.result({
  "duration": 222265556,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "@trevizan2018",
      "offset": 9
    }
  ],
  "location": "srBarrigaConta.aSenha(String)"
});
formatter.result({
  "duration": 142676544,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.selecionoEntrar()"
});
formatter.result({
  "duration": 753565721,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.visualizoAPáginaInicial()"
});
formatter.result({
  "duration": 86326527,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.selecionoContas()"
});
formatter.result({
  "duration": 129652493,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.selecionoAdicionar()"
});
formatter.result({
  "duration": 440195194,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Conta de teste",
      "offset": 17
    }
  ],
  "location": "srBarrigaConta.informoAConta(String)"
});
formatter.result({
  "duration": 229658711,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.selecionoSalvar()"
});
formatter.result({
  "duration": 382811005,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.souNotificadoQueJáExisteUmaContaComEsseNome()"
});
formatter.result({
  "duration": 71653716,
  "status": "passed"
});
formatter.after({
  "duration": 698776924,
  "status": "passed"
});
});