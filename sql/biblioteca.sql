-- criacao do bd e definindo-o como padrao 
CREATE DATABASE Biblioteca;
USE Biblioteca;

-- criacao das tabelas
CREATE TABLE IF NOT EXISTS usuario (
	CPF VARCHAR(14) PRIMARY KEY,
    nome VARCHAR (45) NOT NULL,
    telefone VARCHAR(13),
    login VARCHAR(35) NOT NULL,
    senha VARCHAR(8) NOT NULL,
    flag_bibli BOOLEAN NOT NULL
);

CREATE TABLE IF NOT EXISTS item (
	id_material INT AUTO_INCREMENT PRIMARY KEY,
    dt_inicio_emprestimo DATE NOT NULL,
    dt_final_emprestimo DATE NOT NULL,
    dt_entrega DATE NOT NULL,
    titulo VARCHAR(45) NOT NULL,
    ano VARCHAR (4) NOT NULL,
    valor_patrimonial FLOAT NOT NULL, 
    flag_L BOOLEAN NOT NULL,
    autor VARCHAR(45),
    edicao SMALLINT,
    flag_R BOOLEAN NOT NULL,
    editora VARCHAR(35),
	volume_exemplar SMALLINT,
	numero_exemplar SMALLINT
);

CREATE TABLE IF NOT EXISTS endereco (
	id_usuario VARCHAR(14) NOT NULL,
    CEP VARCHAR(10) NOT NULL,
    rua VARCHAR(35) NOT NULL,
    numero VARCHAR(5) NOT NULL,
	bairro VARCHAR(35) NOT NULL,
    complemento VARCHAR(35),
    
	CONSTRAINT PK_end PRIMARY KEY (id_usuario, CEP),
    CONSTRAINT fk_endUsu FOREIGN KEY (id_usuario) REFERENCES usuario(CPF)
);

CREATE TABLE IF NOT EXISTS frequencia (
	id_bibliotecario VARCHAR(14) NOT NULL,
    dt_entrada DATE NOT NULL,
    hr_entrada TIME NOT NULL,
    hr_saida TIME NOT NULL,
    
    CONSTRAINT PK_freq PRIMARY KEY (id_bibliotecario, dt_entrada),
    CONSTRAINT FK_freqUsu FOREIGN KEY (id_bibliotecario) REFERENCES usuario (CPF)
);

CREATE TABLE IF NOT EXISTS supervisiona_emp (
	id_bibliotecario VARCHAR(14) NOT NULL,
    id_item INT NOT NULL,
    
    CONSTRAINT PK_super_emp PRIMARY KEY (id_bibliotecario, id_item),
    CONSTRAINT FK_super_emp_item FOREIGN KEY (id_bibliotecario) REFERENCES usuario (CPF)
);

CREATE TABLE IF NOT EXISTS realiza_emp (
	id_cliente VARCHAR(14) NOT NULL,
    id_item INT NOT NULL,
    
    CONSTRAINT PK_realiza_emp PRIMARY KEY (id_cliente, id_item),
    CONSTRAINT FK_realiza_emp_user FOREIGN KEY (id_cliente) REFERENCES usuario (CPF)
);

ALTER TABLE endereco MODIFY complemento VARCHAR(35) NULL;
ALTER TABLE frequencia MODIFY dt_entrada VARCHAR(10) NOT NULL;
ALTER TABLE frequencia MODIFY hr_entrada VARCHAR(5) NOT NULL;
ALTER TABLE frequencia MODIFY hr_saida VARCHAR(5) NOT NULL;

ALTER TABLE frequencia MODIFY dt_entrada DATE NOT NULL;
ALTER TABLE frequencia MODIFY hr_entrada TIME NOT NULL;
ALTER TABLE frequencia MODIFY hr_saida TIME NOT NULL;

DESCRIBE usuario;
DESCRIBE item;
DESCRIBE endereco;
DESCRIBE frequencia;
DESCRIBE supervisiona_emp;
DESCRIBE realiza_emp;


