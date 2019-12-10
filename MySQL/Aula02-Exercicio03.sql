#Crie uma base de dados chamada exercicio03.
create database exercicio03;

#Selecione a base de dados.
use exercicio03;

/*
Crie uma tabela chamada alunos, com a seguinte estrutura:
	código do tipo inteiro, auto incrementado e chave-primária,
	nome varchar de 30 caracteres,
	genero de 20 caracteres,
	nota1 do tipo double,
	nota2 do tipo double,
	nota3 do tipo double*/
create table alunos(
	codigo int auto_increment primary key,
    nome varchar(30),
    genero varchar(20),
    nota1 double,
    nota2 double,
    nota3 double
);

/*
Crie a seguinte tabela:
	Aluno		Gênero		Nota 1		Nota 2		Nota 3
	Alana      Feminino       7           8           9
	Brenda     Feminino      8.8         7.3         7.7
	Gustavo    Masculino      9          9.1         8.6
	Júlio      Masculino     4.5         3.9          4
	Jéssica    Feminino       7          6.8          7
	Lúcia      Feminino      10          9.8          10
	Rony       Masculino     5.6         6.3         5.9
	Tamara     Feminino       7           8          7.5
	Guilherme  Masculino      7          7.1         7.7
	Lorena     Feminino       4          4.5         4.4
*/
insert into alunos (nome, genero, nota1, nota2, nota3) values
("Alana", "Feminino", 7, 8, 9),
("Brenda", "Feminino", 8.8, 7.3, 7.7),
("Gustavo", "Masculino", 9, 9.1, 8.6),
("Júlio", "Masculino", 4.5, 3.9, 4),
("Jéssica", "Feminino", 7, 6.8, 7),
("Lúcia", "Feminino", 10, 9.8, 10),
("Rony", "Masculino", 5.6, 6.3, 5.9),
("Tamara", "Feminino", 7, 8, 7.5),
("Guilherme", "Masculino", 7, 7.1, 7.7),
("Lorena", "Feminino", 4, 4.5, 4.4);

#Exiba a tabela completa.
select * from alunos;

#Exiba a quantidade de homens e mulheres.
select genero, count(*) from alunos group by genero;

#Conte quantos alunos obtiveram média 7 ou superior.
select nome, round((nota1+nota2+nota3)/3,2) as Media from alunos;

#Exiba nome, notas e média do aluno com a maior média.
select count(*) from alunos where round((nota1+nota2+nota3)/3,2) >= 7;

#Exiba nome, notas e média do aluno com a maior média.
select nome, nota1, nota2, nota3, round((nota1+nota2+nota3)/3,2) as Media from alunos where (nota1+nota2+nota3)/3 = (select max((nota1+nota2+nota3)/3) from alunos);

#Exiba nome, notas e média do aluno com a menor média.
select nome, nota1, nota2, nota3, round((nota1+nota2+nota3)/3,2) as Media from alunos where (nota1+nota2+nota3)/3 = (select min((nota1+nota2+nota3)/3) from alunos);

#Exiba todos os nomes cadastrados e suas situações. Caso a média seja 7 ou mais exibir Aprovado, caso contrário Reprovado.
select nome, if((nota1+nota2+nota3)/3 >= 7, "Aprovado", "Reprovado") as Situação from alunos;

#Altere a aluna Jéssica para Joice.
update alunos set nome = "Joice" where codigo = 5;

#Exiba a quantidade de alunos que tenham média de 7 ou superior e do gênero masculino.
select count(*) from alunos where round((nota1+nota2+nota3)/3 >= 7) and genero = "Masculino";

#Exiba a quantidade de alunos que tenham a média entre 8 e 9 do gênero feminino. Uma dica interessante é utilizar o comando Between.
select count(*) from alunos where round((nota1+nota2+nota3)/3 between 8 and 9) and genero = "Feminino";

#Exiba a média da turma.
select avg(round((nota1+nota2+nota3)/3)) as Media_da_turma from alunos;

#Exiba o nome dos alunos e suas médias, onde suas respectivas médias sejam maiores ou iguais a média da turma.
select nome, round((nota1+nota2+nota3)/3,2) as Medias from alunos where (nota1+nota2+nota3)/3 >= 7;

#Liste o nome dos alunos, onde as três notas obtidos sejam 7 ou superior.
select nome, nota1, nota2, nota3 from alunos where nota1 >7 and nota2>7 and nota3>7;

#Exclua a tabela alunos.
drop table alunos;

#Exclua a base de dados.
drop database exercicio03;