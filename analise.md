1. **Identificar** o acoplamento causado pelo `if/else` com `new` em `GerenciadorLogin`.

No arquivo src/siga/GerenciadorLogin.java, é possivel notar a utilização de um bloco condicional if/else dentro do método `montarPainel`. Esse método tem como função verificar o tipo de usuário que está acessando o sistema e assim definir qual o painel que deverá ser exibido para o mesmo.

A utilização deste bloco condicional gera um forte aclopamento dentro do método, fazendo com que seja necessário realizar constantes modificações caso seja acrescentados mais usuários ou paineis diferentes futuramente, ocasionado a violação do principio Aberto/Fechado (OCP).
