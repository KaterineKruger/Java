create database exercicio01;

use exercicio01;

create table uzuarios(
	codigo int auto_increment primary key,
    nome varchar(20),
    sobrenome varchar(40),
    idade int
);

rename table uzuarios to usuarios;

alter table usuarios add email varchar(40);

select * from usuarios;

alter table usuarios drop column sobrenome;

insert into usuarios (nome, idade, email) values
("Vanessa", 16, "vanessa.rosa@gmail.com"),
("Adailton", 22, "adailton.maas@yahoo.com"),
("Andressa", 36, "dessa.simas@uol.com.br"),
("Mayra", 24, "mayra.antunes@gmail.com"),
("Cristiane", 14, "criss.maya@gmail.com"),
("Leonardo", 15, "leo.kopff@terra.com.br"),
("Carina", 27, "carina.almeida@gmail.com"),
("Clóvis", 29, "clovis.simao@hotmail.com"),
("Gabriela", 23, "gabriela.braga@live.com"),
("Cibele", null, "cibele.lins@uol.com.br");

select count(*) from usuarios;

select count(*) from usuarios WHERE idade <= 17;

select count(*) from usuarios where email like "%gmail%";

#Como retornar apenas o nome?
select * from usuarios where idade = (select max(idade) from usuarios);

select * from usuarios where idade is null;

SET SQL_SAFE_UPDATES = 0;

update usuarios set idade=27 where idade is null;

delete from usuarios where idade < 18;

truncate table usuarios;

drop database exercicio01;