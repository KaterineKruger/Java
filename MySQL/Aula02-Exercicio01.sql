#Crie uma base de dados chamada exercicio01.
create database exercicio01;

#Selecione a base de dados.
use exercicio01;

/*
Crie uma tabela chamada uzuarios, com a seguinte estrutura:
	código do tipo inteiro, auto incrementado e chave-primária,
	nome varchar de 20 caracteres,
	sobrenome de 40 caracteres,
	idade do tipo inteiro*/
create table uzuarios(
	codigo int auto_increment primary key,
    nome varchar(20),
    sobrenome varchar(40),
    idade int
);

#Renomeie a tabela uzuarios para usuarios.
rename table uzuarios to usuarios;

#Adicione uma coluna e-mail com suporte até 40 caracteres.
alter table usuarios add email varchar(40);

#Exiba a tabela completa.
select * from usuarios;

#Exclua a coluna sobrenome.
alter table usuarios drop column sobrenome;

/*
Crie a seguinte tabela:
		Nome			Idade				E-mail
	   Vanessa            16         vanessa.rosa@gmail.com
	  Adailton            22        adailton.maas@yahoo.com.br
      Andressa            36          dessa.simas@uol.com.br
	   Mayra              24         mayra.antunes@gmail.com
     Cristiane            14           criss.maya@gmail.com
	  Leonardo            15          leo.kopff@terra.com.br
	   Carina             27         carina.almeida@gmail.com
       Clóvis             29         clovis.simao@hotmail.com
      Gabriela            23          gabriela.braga@live.com
       Cibele            null          cibele.lins@uol.com.br
*/
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

#Exiba a quantidade de registros existentes na tabela.
select count(*) from usuarios;

#Exiba a quantidade de usuários com idade até 17 anos.
select count(*) from usuarios WHERE idade <= 17;

#Retorne a quantidade de usuários com o e-mail gmail.
select count(*) from usuarios where email like "%gmail%";

#Retorne o nome e a idade da pessoa mais velha.
#Como retornar apenas o nome?
select * from usuarios where idade = (select max(idade) from usuarios);

#Retorne os dados do usuário com idade igual a nulo.
select * from usuarios where idade is null;

#Comando para alteração de dados na tabela.
SET SQL_SAFE_UPDATES = 0;

#Altere para 27 todas as idades nulas.
update usuarios set idade=27 where idade is null;

#Delete todos os usuários com idade inferior a 18 anos.
delete from usuarios where idade < 18;

#Exclua todos os dados da tabela e reiniciar a contabilização.
truncate table usuarios;

#Exclua a base de dados.
drop database exercicio01;