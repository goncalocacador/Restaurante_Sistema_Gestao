# Restaurante_Sistema_Gestao

Projeto desenvolvido no âmbito da unidade curricular Engenharia de Software, do curso de Engenharia Informática (2º ano), ano letivo 2025/2026.

 Descrição do Projeto

O Sistema de Gestão de Restaurante tem como objetivo apoiar e organizar as principais operações de um restaurante, nomeadamente:

Gestão de pedidos

Acompanhamento do estado dos pedidos pela cozinha

Faturação e pagamento

Controlo básico de stock

O sistema foi concebido seguindo boas práticas de Engenharia de Software, incluindo análise de requisitos, modelação UML, aplicação de padrões de desenho, princípios SOLID e testes automatizados.


 Objetivos

Reduzir erros no registo de pedidos e faturação

Melhorar a comunicação entre sala, cozinha e gerência

Garantir um sistema modular, extensível e de fácil manutenção

Aplicar conceitos teóricos numa implementação prática em Java



 Stakeholders Principais

Cliente – Espera um serviço rápido e correto

Empregado de Mesa – Regista pedidos e pagamentos

Cozinheiro – Visualiza e atualiza o estado dos pedidos

Gerente – Gere stock, menu e analisa vendas

Sistema de Pagamento – Processa pagamentos de forma segura


 Funcionalidades Implementadas

 Criação de pedidos associados a mesas
 Adição e remoção de itens do menu
 Atualização do estado dos pedidos (State Pattern)
 Visualização de pedidos pela cozinha
 Cálculo automático da fatura
 Registo de pagamentos
 Atualização de stock após venda
 Testes automatizados com JUnit

 Gestão completa de reservas
 Gestão avançada de stock

 Arquitetura

O sistema segue uma Arquitetura em Camadas:

Camada de Apresentação – Interação com os utilizadores

Camada de Lógica de Negócio – Regras e processos do sistema

Camada de Dados – Gestão e persistência da informação


 Padrões de Desenho Utilizados

State – Gestão do estado dos pedidos

Factory – Criação de diferentes tipos de pagamento

Repository – Centralização do acesso aos dados


 Princípios SOLID

Single Responsibility Principle (SRP)

Open/Closed Principle (OCP)

Liskov Substitution Principle (LSP)

Interface Segregation Principle (ISP)

Dependency Inversion Principle (DIP)


 Testes

Framework: JUnit

Tipos de Teste:

Testes unitários

Testes de integração

Testes funcionais

Testes de estados

Testes de valores limite

Os testes garantem o cumprimento dos requisitos funcionais e não funcionais, bem como a fiabilidade do sistema.


 Tecnologias Utilizadas

Java – Linguagem principal

JUnit – Testes automatizados

Maven / Gradle – Gestão de dependências e build

StarUML – Modelação UML

Git & GitHub – Controlo de versões

Estrutura do Projeto


Como Executar
1 - Clonar o repositório:

git clone https://github.com/username/sistema-gestao-restaurante.git

2- Abrir o projeto numa IDE (IntelliJ, Eclipse, VS Code)

3 - Compilar o projeto com Maven ou Gradle

4 - Executar os testes JUnit

Autor
Gonçalo Caçador
Nº 230001121
Curso: Engenharia Informática

Licença
Projeto desenvolvido para fins académicos.
