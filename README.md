# ONG Amigos do Bairro Gusmão - MVP

Projeto desenvolvido para a conclusão da 3ª experiência prática acadêmica da UNICID, do curso de ADS. Realizado na disciplina de Projeto de Software, tem como proposta a criação de um MVP para a fictícia ONG Amigos do Bairro Gusmão, desenvolvido em Java 21 e SQLite.

É um sistema voltado para a gestão da ONG, que abrange o cadastro e validação de doações (cestas básicas e livros). Além disso, auxilia no controle de estoque das referidas doações para o público-alvo (famílias de baixa renda do bairro). A intenção é simular a operação da ONG de forma coerente com regras realistas e boas práticas de desenvolvimento.

## Estrutura do Projeto
- `Conexao.java`: Gerencia a conexão com o banco de dados SQLite via JDBC.
- `Doacao.java`: Classe de modelo com atributos (id, tipo, descrição, quantidade) e regras de validação.
- `Main.java`: Classe executável para testes unitários e validação do fluxo de doações.

## Tecnologias Utilizadas
- Java 21
- SQLite JDBC
- VS Code
- Git / GitHub Desktop