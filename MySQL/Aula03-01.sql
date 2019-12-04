#Criar base de dados
create database unirtabelas;

#Selecionar base de dados;
use unirtabelas;

#Tabela de marcas
create table marcas(
	idMarca int auto_increment primary key,
    nomeMarca varchar(30)
);

#Tabela de produtos
create table produtos(
	idProduto int auto_increment primary key,
    nomeProduto varchar(30),
    idMarca int,
    foreign key(idMarca) references marcas(idMarca)
);

#Inserir marcas
insert into marcas (nomeMarca) values
("Nestlé"),
("Kraft Heinz"),
("Coca-Cola");

#Inserir produtos
insert into produtos (nomeProduto, idMarca) values
("Guaraná Kuat", 3),
("Ketchup 500gr Heinz", 2),
("Água Mineral Crystal", 3),
("Creme de Leite Light", 1);

delete from produtos where idProduto = 6;

#Selecionar produtos
select * from produtos;

#Unir dados entre tabelas
select
	produtos.nomeProduto,
    marcas.nomeMarca
from produtos
inner join marcas
on produtos.idMarca = marcas.idMarca;

#Inserir uma nova marca
insert into marcas (nomeMarca) values ("Mondelez");

#Exibir quantidade de produtos por marcas
select
	marcas.nomeMarca,
    count(produtos.idProduto)
from marcas
left join produtos
on marcas.idMarca = produtos.idMarca
group by marcas.nomeMarca;

select
	marcas.nomeMarca,
    produtos.nomeProduto
from marcas
left join produtos
on marcas.idMarca = produtos.idMarca;


#Criar base
create database escola;

#Selecionar base

use escola;

#Tabela de alunos
create table alunos(
	idAluno int auto_increment,
    nomeAluno varchar(30),
    emailAluno varchar(40),
    primary key(idAluno)
);

#Tabela de turmas
create table turmas(
	idTurma int auto_increment,
    nomeTurma varchar(5),
    turnoTurma varchar(12),
    primary key(idTurma)
);

#Tabela de professores
create table professores(
	idProfessor int auto_increment,
    nomeProfessor varchar(30),
    materiaProfessor varchar(20),
    primary key(idProfessor)
);

#Tabela para unir os dados
create table turmasFormadas(
	idTurma int,
    idAluno int,
    idProfessor int,
    foreign key(idTurma) references turmas(idTurma),
    foreign key(idAluno) references alunos(idAluno),
    foreign key(idProfessor) references professores(idProfessor)
);

#Cadastrar alunos
insert into alunos (nomeAluno, emailAluno) values
("Christian", "cris.antunes@gmail.com"),
("Dênis", "denis.oliveira@live.com"),
("Elaine", "elaine.wust@gmail.com"),
("Felipe", "felipe.melo@gmail.com"),
("Graziela", "grazi.mendes@uol.com.br");

#Cadastrar turmas
insert into turmas (nomeTurma, turnoTurma) values
("8A", "Vespertino"),
("7C", "Matutino");

#Cadastrar professores
insert into professores (nomeProfessor) values
("Wellington"),
("Vanessa");

#Cadastrar turmasFormadas
insert into turmasFormadas values
(1, 1, 1),
(2, 2, 2),
(1, 3, 1),
(2, 4, 2),
(1, 5, 1);

#Selecionar dados da tabela turmasFormadas
select
	turmas.nomeTurma,
    alunos.nomeAluno,
    professores.nomeProfessor
from turmasFormadas
inner join turmas
on turmasFormadas.idTurma = turmas.idTurma
inner join alunos
on turmasFormadas.idAluno = alunos.idAluno
inner join professores
on turmasFormadas.idProfessor = professores.idProfessor;

#Criar uma View
create view selecionarTurmasFormadas as
select
	turmas.nomeTurma,
    alunos.nomeAluno,
    professores.nomeProfessor
from turmasFormadas
inner join turmas
on turmasFormadas.idTurma = turmas.idTurma
inner join alunos
on turmasFormadas.idAluno = alunos.idAluno
inner join professores
on turmasFormadas.idProfessor = professores.idProfessor;

#Executar a view
select * from selecionarTurmasFormadas;

#Remover view
drop view selecionarTurmasFormadas;

#Criar uma procedure
create procedure contarTurmasFormadas()
select count(*) from turmasFormadas;

#Executar procedure
call contarTurmasFormadas();

#Criar procedure com parâmetros
create procedure cadastrarTurmasFormadas(idTurma int, idAluno int, idProfessor int)
insert into turmasFormadas values (idTurma, idAluno, idProfessor);

#Executar procedure
call cadastrarTurmasFormadas(2, 1, 2);

#Procedure com dois comandos SQL ou mais
DELIMITER $$
create procedure comandosMultiplos(idTurma int, idAluno int, idProfessor int)
	begin
		insert into turmasFormadas values (idTurma, idAluno, idProfessor);
		select * from selecionarTurmasFormadas;
	end$$
DELIMITER ;

call comandosMultiplos(2, 1, 2);