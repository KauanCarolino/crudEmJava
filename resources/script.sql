CREATE DATABASE agenda;

CREATE TABLE contatos(
	id INT  NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50),
    idade INT,
    dataCadastro DATE 
);