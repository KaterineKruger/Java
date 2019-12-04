/*
Condições:
R1 – Um livro pode possuir mais de um autor.
R2 – Um livro deve possuir uma categoria e podem existir vários livros com a mesma categoria.
R3 – Podem ser atribuídas várias tags para um determinado livro e uma tag pode estar associada a vários livros.
R4 – A livraria deve possuir um cadastro de seus associados.
R5 – Cada associado pode alugar um ou mais livros durante uma única locação.
R6 – O valor de cada locação será definido pela quantidade de livros retirados, e todos os livros possuem o mesmo valor de locação, entretanto o valor de colação de um livro pode mudar em períodos distintos.
R7 – Livros de mesmo isbn devem possuir um código sequencial para diferenciá-los.
*/

#Criar base de dados:
create database livraria;

#Selecionar base de dados:
use livraria;

#Definição da tabela Autor:
create table autor(
id int not null primary key auto_increment,
nome varchar(50) not null,
sobrenome varchar(100) not null,
data_nascimento date not null
);

#INSERT-------------------------------------------------

#Definição da tabela Categoria:
create table categoria(
id int not null primary key auto_increment,
nome varchar(100) not null
);

#Definição da tabela Tag:
create table tag(
id int not null primary key auto_increment,
nome varchar(100) not null
);

#INSERT-------------------------------------------------

#Definição da tabela Livro:
create table livro(
id int not null primary key auto_increment,
titulo varchar(200) not null,
data_publicacao date not null,
edicao int not null,
codigo_sequencial int not null,
id_categoria int not null
);
alter table livro add constraint fk_categoria foreign key(id_categoria) references categoria(id);

#INSERT-------------------------------------------------

#Definição da tabela Livro_Autor:
create table livro_autor(
id int not null primary key auto_increment,
id_livro int not null,
id_autor int not null
);
alter table livro_autor add constraint fk_livro foreign key(id_livro) references livro(id);
alter table livro_autor add constraint fk_autor foreign key(id_autor) references autor(id);

#Definição da tabela livro_tag:
create table livro_tag(
id int not null primary key auto_increment,
id_livro int not null,
id_tag int not null
);
alter table livro_tag add constraint fk_book foreign key(id_livro) references livro(id);
alter table livro_tag add constraint fk_tag foreign key(id_tag) references tag(id);

#Definição da tabela sócio:
create table socio(
id int not null primary key auto_increment,
nome varchar(50) not null,
sobrenome varchar(100) not null,
data_nascimento date not null,
profissao varchar(200),
sexo varchar(1) not null
);

#Definição da tabela locação:
create table locacao(
id int not null primary key auto_increment,
data_retirada date not null,
data_previsao_devolucao date not null,
data_devolucao date,
id_socio int not null
);
alter table locacao add constraint fk_socio foreign key(id_socio) references socio(id);

#Definição da tabela locacao_livro:
create table locacao_livro(
id int not null primary key auto_increment,
id_livro int not null ,
id_locacao int not null
);
alter table locacao_livro add constraint fk_livro_locacao_livro foreign key(id_livro) references livro(id);
alter table locacao_livro add constraint fk_locacao_locacao_livro foreign key(id_locacao) references locacao(id);

#CONSULTA

#Consultar o título de um livro juntamente com o nome de sua categoria:
Select livro.titulo, categoria.nome from livro inner join categoria on categoria.id = livro.id_categoria;

#Consultar o título de um livro juntamente com a sua tag:
select livro.titulo, tag.nome from livro left join livro_tag on livro_tag.id_livro = livro.id left join tag on tag.id = livro_tag.id_tag;

#Consultar o nome de todas as tags juntamente com o nome de todas as categorias:
select tag.nome from tag union select categoria.nome from categoria;

#Exibir quantas tags estão relacionadas a um determinado livro:
select livro.titulo, count(tag.nome) from livro inner join livro_tag on livro_tag.id_livro = livro.id inner join tag on tag.id = livro_tag.id_tag group by livro.nome;

#Exibir somente os livros que possuem duas ou mais tags associadas:
select livro.titulo, count(tag.nome) from livro inner join livro_tag on livro_tag.id_livro = livro.id inner join tag on tag.id = livro_tag.id_tag group by livro.titulo having count(tag.nome) > 1;

#Criar uma VIEW que irá armazenar o resultado da consulta dos livros juntamente com o nome de sua respectiva categoria:
create view livro_com_categoria as select l.titulo, c.nome categoria from livro l inner join categoria c on(l.id_categoria = c.id);

#Selecionar dados da View:
select * from livros_com_categoria where categoria = 'programação';

#Alterar as informações de uma View:
alter view livro_com_categoria as select l.titulo, c.nome categoria from livro l inner join categoria c on(l.id_categoria = c.id);

#Excluir uma view:
drop view livros_com_categoria;

#Criar um índice:
create index idx_socio on locacao(id_socio);

#Remover um índice:
drop index idx_socio on locacao;