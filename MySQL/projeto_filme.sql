#CRIAR UMA BASE DE DADOS
CREATE DATABASE projeto_filme;

#SELECIONAR A BASE DE DADOS
USE projeto_filme;

#CRIAR A TABELA DE CATEGORIAS
CREATE TABLE categorias(
	idCategoria INT AUTO_INCREMENT PRIMARY KEY,
    nomeCategoria VARCHAR(20)
);

#CRIAR A TABELA DE FILMES
CREATE TABLE filmes(
	idFilme INT AUTO_INCREMENT PRIMARY KEY,
    nomeFilme VARCHAR(40),
    categoriaFilme INT,
    FOREIGN KEY(categoriaFilme) REFERENCES categorias(idCategoria)
);

#INSERIR CATEGORIAS
INSERT INTO categorias (nomeCategoria) VALUES
("Ação"),
("Aventura"),
("Drama"),
("Romance"),
("Terror");

#INSERIR FILMES
INSERT INTO filmes (nomeFilme, categoriaFilme) VALUES
("Avatar", 2),
("Os Vingadores", 1);

#JOIN
SELECT filmes.idFilme, filmes.nomeFilme, categorias.nomeCategoria FROM filmes INNER JOIN categorias ON filmes.categoriaFilme = categorias.idCategoria;