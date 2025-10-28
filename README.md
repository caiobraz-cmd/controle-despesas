# Sistema de Controle de Despesas (Projeto POO)

## 1. Visão Geral do Projeto

Este projeto é um sistema de console para controle de despesas pessoais, desenvolvido em Java como projeto da disciplina de Programação Orientada a Objetos.

A estratégia de construção segue uma abordagem incremental, começando pela definição do fluxo de navegação principal (o menu) e, em seguida, implementando cada funcionalidade de forma modular.

## 2. Funcionalidades Planejadas

O sistema foi estruturado em torno de um menu principal que dará acesso às seguintes funcionalidades:

-   **Entrar Despesa:** Permitir ao usuário cadastrar uma nova despesa (descrição, valor, vencimento, etc.).
-   **Anotar Pagamento:** Permitir ao usuário marcar uma despesa como paga ou registrar um pagamento parcial.
-   **Listar Despesas em Aberto:** Exibir um relatório de todas as despesas que ainda não foram pagas.
-   **Listar Despesas Pagas:** Exibir um relatório de todas as despesas já quitadas.
-   **Gerenciar Tipo de Despesa:** Um submenu para criar, editar ou excluir categorias de despesa (ex: Alimentação, Transporte).
-   **Gerenciar Usuários:** Um submenu para cadastrar novos usuários ou gerenciar existentes.
-   **Sair:** Encerrar a aplicação.

## 3. Changelog da Entrega

### Primeira Entrega (28/10/2025)

-   Criação da estrutura inicial do projeto com o arquivo `Main.java`.
-   Implementação do menu principal interativo utilizando um loop `while(true)` e `Scanner` para entrada do usuário.
-   Definição do fluxo de navegação com uma estrutura `switch-case` para todas as funcionalidades planejadas.
-   Adição de mensagens descritivas (`System.out.println`) para cada opção do menu, servindo como documentação inicial do escopo de cada funcionalidade.
-   Implementação da lógica de "Sair" do sistema e do tratamento de "Opção Inválida".