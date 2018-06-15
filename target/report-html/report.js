$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SrBarriga.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Cadastro de contas",
  "description": "\r\nComo um usuário \r\nGostaria de cadastrar contas\r\nPara que eu possa distribuir meu dinheiro de uma forma mais organizada",
  "id": "cadastro-de-contas",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 22,
  "name": "Não deve inserir uma conta sem nome",
  "description": "",
  "id": "cadastro-de-contas;não-deve-inserir-uma-conta-sem-nome",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 21,
      "name": "@contaSemNome"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.step({
  "line": 24,
  "name": "informo o usuário \"rafaela@infotera.com.br\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 25,
  "name": "a senha \"@trevizan2018\"",
  "keyword": "E "
});
formatter.step({
  "line": 26,
  "name": "seleciono entrar",
  "keyword": "E "
});
formatter.step({
  "line": 27,
  "name": "visualizo a página inicial",
  "keyword": "Então "
});
formatter.step({
  "line": 28,
  "name": "seleciono Contas",
  "keyword": "Quando "
});
formatter.step({
  "line": 29,
  "name": "seleciono Adicionar",
  "keyword": "E "
});
formatter.step({
  "line": 30,
  "name": "seleciono Salvar",
  "keyword": "E "
});
formatter.step({
  "line": 31,
  "name": "vou notificar que o nome da conta é obrigatório",
  "keyword": "Então "
});
formatter.match({
  "location": "srBarrigaConta.queEstouAcessandoAAplicação()"
});
formatter.result({
  "duration": 9154661550,
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
  "duration": 259180350,
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
  "duration": 163914196,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.selecionoEntrar()"
});
formatter.result({
  "duration": 765528791,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.visualizoAPáginaInicial()"
});
formatter.result({
  "duration": 80435114,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.selecionoContas()"
});
formatter.result({
  "duration": 133778800,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.selecionoAdicionar()"
});
formatter.result({
  "duration": 415094624,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.selecionoSalvar()"
});
formatter.result({
  "duration": 343814353,
  "status": "passed"
});
formatter.match({
  "location": "srBarrigaConta.souNotificarQueONomeDaContaÉObrigatório()"
});
formatter.result({
  "duration": 384423122,
  "status": "passed"
});
formatter.after({
  "duration": 878881254,
  "status": "passed"
});
});