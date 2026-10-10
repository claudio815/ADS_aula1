# Projeto MAPA - Análise e Desenvolvimento de Sistemas (POO em Java)

Este repositório contém a resolução da atividade MAPA da disciplina de Programação Orientada a Objetos.

##  Conteúdo do Projeto

- **Veiculo.java**: Superclasse que define atributos gerais de um veículo (Placa, Ano).
- **Caminhao.java**: Subclasse de Veiculo com o atributo específico `eixos` e sobrescrita do método `exibirDados()`.
- **Onibus.java**: Subclasse de Veiculo com o atributo específico `assentos` e sobrescrita do método `exibirDados()`.
- **Main.java**: Classe principal responsável por instanciar a frota em um Array e demonstrar o Polimorfismo.
- **banco.sql**: Script SQL contendo o DDL para criação do banco de dados e tabelas relacionais.

## Como Executar no Terminal (Termux / Linux)

1. Compilar as classes Java:
   ```bash
   javac *.java

