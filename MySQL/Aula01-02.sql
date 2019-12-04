#Base de dados:
create database apex_aula01;

#Selecionar base de dados:
use apex_aula01;

#Tabela:
create table cursos(
	nome varchar(30),
    categoria varchar(20)
);

#Inserir cursos:
insert into cursos values
("Java", "Back-End"),
("HTML", "Front-End"),
("C#", "Back-End"),
("PHP", "Back-End"),
("CSS", "Front-End");

#Selecionar cursos:
select categoria, count(*) from cursos group by categoria;