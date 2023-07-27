# Sistema de Padaria


## Integrantes do grupo:
 * Caio Gabriel Nunes de Lima - gabrielnunesdelima2003@gmail.com
 * Felipe Pereira Reis  -  felipepereirareis2104@gmail.com
 * João Victor Morais Barreto da silva  - joaovictor8454@gmail.com
 * Ramon Artur Vilela de Oliveira - ramonvilela92@hotmail.com

## Descrição:
- Este sistema será utilizado pelos funcionários da empresa.
- Nele será possível realizar cadastro de itens no estoque da loja, registro de vendas, registro de despesas, etc.
- A principal funcionalidade é o gerenciamento virtual dos trâmites de uma loja física (padaria).
- Levando em consideração dois tipos de usuários (administrador e usuário):

  Usuário do tipo Administrador: Além das ações permitidas aos usuários, também será possível acessar e alterar informações sensíveis do sistema, como por exemplo inserção de dados novos, cadastros de novos funcionários, etc.

  Usuário do tipo funcionário: realizar vendas, consultar estoque, registrar despesas, sugestões.

## Requisitos:
 * **REQ1** - O sistema deve controlar o acesso através de login e senha. Os usuários do sistema serão do tipo administrador e funcionário.
 * **REQ2** - O sistema deve permitir a venda de produtos previamente cadastrados e salvá-los como em um histórico de vendas por cliente. Cada venda de produto deve ser associada a um cliente único.
 * **REQ3** - O sistema deve permitir o gerenciamento (Create, Recover, Update e Delete - CRUD) de produtos e essa ação pode ser feita por funcionários comuns.
 * **REQ4** - O sistema deve permitir o gerenciamento (CRUD) de funcionários da empresa e essa ação somente poderá ser executada por usuários administradores. Usuários administradores também podem executar todas as funcionalidades que um funcionário comum pode executar.
