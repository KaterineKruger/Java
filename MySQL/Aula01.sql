#Criar base de dados:
create database apex_aula01;

#Usar database:
use apex_aula01;

#Criar tabela:
create table clientes(
	codigo int primary key auto_increment,
    nome varchar(30) not null,
    email varchar(40),
    idade int
);

#Inserir dados:
insert into clientes values(
	null,
    "Katerine",
    "katerine.kruger@gmail.com",
    21
);
insert into clientes (nome, idade) values ("Guilherme", 22);
insert into clientes (nome, email, idade) values
("Tânia", "taniamtkruger@gmail.com", 42),
("Sérgio", "sergiokinfo@gmail.com", 46),
("Julia", "julia0kruger@gmail.com", 15),
("Ingnora", "ingnora@gmail.com", 87);

#Selecionar dados:
select * from clientes;
select nome, idade from clientes;

#Agrupar dados:
select sum(idade) from clientes;
select avg(idade) from clientes;
select max(idade) from clientes;
select min(idade) from clientes;
select concat("Registros encontrados: ", count(*)) from clientes;

#Condicional:
select
	nome,
    idade,
    if(idade >= 18, "Maior de idade", "Menor de idade") as "condicional"
from clientes;

#Selecionando dados por linha:
select * from clientes where idade <= 18;
select * from clientes where idade <= 18 and email is not null;

#Data e hora:
select now() from clientes limit 1;
select
	date_format(now(), "%d/%m/%Y") as "Data",
    date_format(now(), "%H:%i") as "Hora"
from clientes limit 1;

#Ordenar dados:
select * from clientes order by idade;
select * from clientes order by idade desc;
select * from clientes order by nome asc;
select * from clientes order by nome desc;

#Filtrar dados:
select email from clientes where email like "k%";
select email from clientes where email like "%a%";
select email from clientes where email like "%m";

#Atualizar dados:
update clientes set email = "gui.kramer97@gmail.com", idade = 23 where codigo = 2;
select * from clientes;

#Habilitar o comando update e delete:
set SQL_SAFE_UPDATES = 0;

#Remover dados:
delete from clientes where idade <= 23;
delete from clientes;
select * from clientes;

#Resetar tabela:
truncate clientes;

#Remover tabela:
drop table clientes;

#Remover base de dados:
drop database apex_aula01;