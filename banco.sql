-- Criação do Banco de Dados
CREATE DATABASE IF NOT EXISTS sistema_veiculos;
USE sistema_veiculos;

-- Tabela Pai: Veiculo
CREATE TABLE veiculo (
    id_veiculo INT AUTO_INCREMENT PRIMARY KEY,
    placa VARCHAR(10) NOT NULL,
    ano INT NOT NULL
);

-- Tabela Filha: Caminhao (Relacionamento 1 para 1 com Veiculo)
CREATE TABLE caminhao (
    id_caminhao INT AUTO_INCREMENT PRIMARY KEY,
    id_veiculo INT NOT NULL UNIQUE,
    eixos INT NOT NULL,
    FOREIGN KEY (id_veiculo) REFERENCES veiculo(id_veiculo) ON DELETE CASCADE
);

-- Tabela Filha: Onibus (Relacionamento 1 para 1 com Veiculo)
CREATE TABLE onibus (
    id_onibus INT AUTO_INCREMENT PRIMARY KEY,
    id_veiculo INT NOT NULL UNIQUE,
    assentos INT NOT NULL,
    FOREIGN KEY (id_veiculo) REFERENCES veiculo(id_veiculo) ON DELETE CASCADE
);
