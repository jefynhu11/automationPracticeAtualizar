# language: pt
  @cadastro
  Funcionalidade:  Cadastrado no site loja AutomaticonPraticon

    @cadastro-login
     Cenário: Fazer cadastrar na conta da loja
       Dado que estou no site da loja
       E eu preencho para criar meu email
       E clico em botao
       Quando eu preencho todos os campos
       E clico em botao registrar
       Então verificado se cadastrar com sucesso
