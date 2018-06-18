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
formatter.scenarioOutline({
  "line": 13,
  "name": "Deve validar regras de cadastro contas",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-de-cadastro-contas",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "line": 14,
  "name": "adiciono a conta \"\u003cnome\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "recebo a mensagem \"\u003cmensagem\u003e\"",
  "keyword": "Então "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-de-cadastro-contas;",
  "rows": [
    {
      "cells": [
        "nome",
        "mensagem"
      ],
      "line": 18,
      "id": "cadastro-de-contas;deve-validar-regras-de-cadastro-contas;;1"
    },
    {
      "cells": [
        "Conta de teste",
        "Conta adicionada com sucesso!"
      ],
      "line": 19,
      "id": "cadastro-de-contas;deve-validar-regras-de-cadastro-contas;;2"
    },
    {
      "cells": [
        "",
        "Informe o nome da conta"
      ],
      "line": 20,
      "id": "cadastro-de-contas;deve-validar-regras-de-cadastro-contas;;3"
    },
    {
      "cells": [
        "Conta mesmo nome",
        "Já existe uma conta com esse nome!"
      ],
      "line": 21,
      "id": "cadastro-de-contas;deve-validar-regras-de-cadastro-contas;;4"
    }
  ],
  "keyword": "Exemplos"
});
formatter.background({
  "line": 10,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 11,
  "name": "que desejo adicionar uma conta",
  "keyword": "Dado "
});
formatter.match({
  "location": "srBarrigaConta.queDesejoAdicionarUmaConta()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 19,
  "name": "Deve validar regras de cadastro contas",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-de-cadastro-contas;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 2,
      "name": "@conta"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "adiciono a conta \"Conta de teste\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "recebo a mensagem \"Conta adicionada com sucesso!\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "Conta de teste",
      "offset": 18
    }
  ],
  "location": "srBarrigaConta.adicionoAConta(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Conta adicionada com sucesso!",
      "offset": 19
    }
  ],
  "location": "srBarrigaConta.receboAMensagem(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 10,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 11,
  "name": "que desejo adicionar uma conta",
  "keyword": "Dado "
});
formatter.match({
  "location": "srBarrigaConta.queDesejoAdicionarUmaConta()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 20,
  "name": "Deve validar regras de cadastro contas",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-de-cadastro-contas;;3",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 2,
      "name": "@conta"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "adiciono a conta \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "recebo a mensagem \"Informe o nome da conta\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 18
    }
  ],
  "location": "srBarrigaConta.adicionoAConta(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Informe o nome da conta",
      "offset": 19
    }
  ],
  "location": "srBarrigaConta.receboAMensagem(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 10,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 11,
  "name": "que desejo adicionar uma conta",
  "keyword": "Dado "
});
formatter.match({
  "location": "srBarrigaConta.queDesejoAdicionarUmaConta()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 21,
  "name": "Deve validar regras de cadastro contas",
  "description": "",
  "id": "cadastro-de-contas;deve-validar-regras-de-cadastro-contas;;4",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 2,
      "name": "@conta"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "adiciono a conta \"Conta mesmo nome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "recebo a mensagem \"Já existe uma conta com esse nome!\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "Conta mesmo nome",
      "offset": 18
    }
  ],
  "location": "srBarrigaConta.adicionoAConta(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Já existe uma conta com esse nome!",
      "offset": 19
    }
  ],
  "location": "srBarrigaConta.receboAMensagem(String)"
});
formatter.result({
  "status": "skipped"
});
});