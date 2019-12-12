#Criar a base de dados.
create database projeto_desktop;

#Selecionar a base de dados.
use projeto_desktop;

#Criar a tabela de usuários.
create table usuarios(
	isUsuario int auto_increment primary key,
    nomeUsuario varchar(30),
    emailUsuario varchar(40),
    senhaUsuario varchar(20),
    nivelUsuario int
);

#Inserir usuário.
insert into usuarios values(null, "Admin", "admin@apexensino.com.br", "Apex", 1);

#Exibir os dados da tabela.
select * from usuarios;

#Criar a tabela de marcas.
create table marcas(
	idMarca int auto_increment primary key,
    nomeMarca varchar(30)
);

#Inserir marcas.
insert into marcas(nomeMarca) values
("Acer"),
("Dell"),
("HP"),
("Lenovo"),
("Samsung");

#Exibir os dados da tabela.
select * from marcas;

#Criar a tabela de produtos.
create table produtos(
	idProduto int auto_increment primary key,
    nomeProduto varchar(40),
    valorProduto double,
    marcaProduto int,
    foreign key(marcaProduto) references marcas(idMarca)
);

#Inserir Produtos.
insert into produtos values
(null, "Inspiron 5600", 4300, 2);

#Exibir os dados da tabela.
select * from produtos;

