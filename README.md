# Sistema de mercearia

## Integrantes do grupo:
- Caio Gabriel Nunes de Lima - gabrielnunesdelima2003@gmail.com
- Felipe Pereira Reis - felipepereirareis2104@gmail.com
- João Victor Morais Barreto da Silva - joaovictor8454@gmail.com
- Ramon Artur Vilela de Oliveira - ramonvilela92@hotmail.com


## Descrição:
   - O sistema oferece recursos de controle de acesso, venda de produtos, gerenciamento de produtos e gerenciamento de funcionários, atendendo às necessidades tanto dos funcionários da padaria quanto dos administradores.

### Perguntas e Respostas:

1. **Quem vai usar o programa?**
   - Funcionários e administradores/gerentes da empresa.

<br>

2. **Que serviços são importantes para os usuários?**
   -  cadastro de produtos
   -  registro de vendas
   -  registro de compras do fornecedor
   -  registro e a atualização do estoque
   
<br>

3. **Qual a principal funcionalidade do seu sistema?**
   - Registrar e gerenciar vendas e estoque de produtos de uma mercearia.

<br>

4. **Quais serviços cada usuário pode executar?**
   - Funcionários podem:
     - Registrar vendas.
     - Cadastrar produtos no estoque.


   - Administradores/gerentes:
     - Gerenciar funcionários da empresa (adicionar, editar, remover).
     - gerenciar os fornecedores da empresa (adicionar, editar, remover).
     - gerenciar os perfis que acessarão o sistema.
     - vizualizar o histórico de compras dos clientes e dos fornecedores.
     - Visualizar relatório de vendas dos produtos, com informações de quantidade vendida e lucro obtido.
     - Executar todas as funcionalidades que um funcionário pode executar.

   
# Requisitos:

**REQ1 - Gerenciamento de Perfil:**

   - O sistema deve possiblitar o gerenciamento (Create, Recover, Update e Delete - CRUD) de perfis dos usuários que utilizarão o sistema.

<br>

**REQ2 - Controle de Acesso:**

   - O sistema deve implementar um controle de acesso baseado em perfis de usuário. Os usuários serão categorizados em dois tipos o administrador/gerente e funcionário, garantindo que cada perfil tenha acesso apenas às funcionalidades autorizadas para sua respectiva função.

<br>

**REQ3 - Venda de Produtos e Histórico de compras dos clientes:**

  - O sistema deve permitir a venda de produtos previamente cadastrados e salvá-los como em um histórico de vendas.

<br>

**REQ4 - Relatório de Vendas dos Produtos:**

   - O sistema deve permitir um relatório das vendas de cada produto vendido, informando a quantidade vendida, o valor de lucro obtido, classificação dos produtos mais vendidos e os produtos que mais geraram lucro.

<br>

**REQ5 - Gerenciamento de Produtos e estoque:**

   - O sistema deve permitir o gerenciamento do estoque e CRUD dos produtos cadastrados.

**REQ6 - Gerenciamento de fornecedores e histórico de compras da mercearia:

   - O sistema deve permitir o gerenciamento CRUD dos fornecedores da loja, além de registrar e listar todas as compras realizadas dos fornecedores.
