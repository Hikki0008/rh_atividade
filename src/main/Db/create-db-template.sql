CREATE DATABASE RhAtividade
    DEFAULT CHARACTER SET = 'utf8mb4';

USE RhAtividade

    CREATE TABLE funcionarios(
        id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
        nome VARCHAR (50) NOT NULL,
        email VARCHAR (50) NOT NULL,
        senha VARCHAR (50) NOT NULL,
        cep VARCHAR (50 ) NOT NULL,
        endereco VARCHAR (50) NOT NULL,
        numero INTEGER (50) NOT NULL,
        bairro VARCHAR (50) NOT NULL,
        cidade VARCHAR (50) NOT NULL,
        estado VARCHAR (50) NOT NULL
    );

    Create TABLE cargos (
        id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
        nome VARCHAR(50) NOT NULL,
        descricao VARCHAR(300)
    );

    CREATE TABLE funcionarios_por_cargo (
        id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
        funcionario_id BIGINT NOT NULL,
        cargo_id BIGINT Not null,
        detalhes TEXT,
        data_inicio DATE NOT NULL,
        data_fim DATE,
        Foreign Key (funcionario_id) REFERENCES funcionarios(id),
        Foreign Key (cargo_id) REFERENCES cargos(id)
    );