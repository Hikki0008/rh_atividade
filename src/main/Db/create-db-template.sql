CREATE DATABASE rhAtividade

Use rhAtividade

CREATE TABLE funcionarios(
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    senha VARCHAR(50) NOT NULL,
    cep VARCHAR(50) NOT NULL,
    endereco VARCHAR(50) NOT NULL,
    rua VARCHAR(50) NOT NULL,
    numero INTEGER(50) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    estado VARCHAR(50) NOT NULL
    );

    CREATE Table cargos (
        id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
        nome VARCHAR(50) NOT NULL,
        descricao VARCHAR(300) NOT NULL
    );