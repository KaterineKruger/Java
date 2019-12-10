#Crie uma base de dados chamada exercicio02.
create database exercicio02;

#Selecione a base de dados.
use exercicio02;

/*
Crie uma tabela chamada produtos com a seguinte estrutura:
	código do tipo inteiro, auto incrementado e chave-primária,
	produto do tipo varchar de 40 caracteres,
	categoria do tipo varchar de 20 caracteres,
	valor do tipo double,
	cadastro do tipo date (padrão europeu que é ano/mês/dia)*/
create table produtos(
	codigo int auto_increment primary key,
    produto varchar(40),
    categoria varchar(20),
    valor double,
    cadastro date
);

/*
Crie a seguinte tabela:
				Produto				Categoria				Valor				Cadastro
        Smartphone Samsung A8       Telefonia             R$1.400,00           2019-07-22
         Notebook Acer A650        Informática            R$3.800,00           2019-03-19
	 Telefone sem fio Intelbras     Telefonia              R$129,90            2018-12-20
               iPhone XR            Telefonia             R$5.499,00           2019-07-08
	  Notebook Dell Espiron 500    Informática            R$3.975,00           2019-02-13
         All in one LG A8574       Informática            R$4.600,00           2019-07-22
        Smartphone Motorola G7      Telefonia              R$799,00            2019-04-03
		 Smartphone Galaxy S10      Telefonia             R$4.600,00           2019-05-03
	    Notebook Acer Axpros 47    Informática            R$2.857,00           2019-08-16
	   Smartphone Asus Zenfone 6    Telefonia             R$2.356,00           2018-07-29
         Smartphone Samsung J4         null               R$1.700,00           2018-06-16
*/
insert into produtos (produto, categoria, valor, cadastro) values
("Smartphone Samsung A8", "Telefonia", 1400, "2019/07/22"),
("Notebook Acer A650", "Informática", 3800, "2019/03/19"),
("Telefone sem fio Intelbras", "Telefonia", 129.9, "2018/12/20"),
("iPhone XR", "Telefonia", 5499, "2019/07/08"),
("Notebook Dell Inspiron 500", "Informática", 3975, "2019/02/13"),
("All in one LG A8574", "Informática", 4600, "2019/07/22"),
("Smartphone Motorola G7", "Telefonia", 799, "2019/04/03"),
("Smartphone Galaxy S10", "Telefonia", 4600, "2019/05/03"),
("Notebook Acer Axpros 47", "Informática", 2857, "2019/08/16"),
("Smartphone Asus Zenfone 6", "Telefonia", 2356, "2018/07/29"),
("Smartphone Samsung J4", null, 1700, "2018/06/16");

#Exiba a tabela completa.
select * from produtos;

#Exiba a quantidade de registros existentes na tabela.
select count(*) from produtos;

#Exiba o nome dos produtos e valor, onde o cadastro esteja entre 01/04/2019 a 31/07/2019.
select * from produtos where cadastro between "2019/04/01" and "2019/07/31";

#Comando para alteração de dados na tabela.
set SQL_SAFE_UPDATES = 0;

#Altere a categoria para Telefonia o produto que seja da categoria null.
update produtos set catrgoria = "Telefonia"  where valor is null;

#Exiba o nome das categorias cadastradas na tabela e a quantidade de produtos.
select categoria, count(*) from produtos group by categoria;

#Exiba a média dos valores por categorias.
select categoria, avg(valor) from produtos group by categoria;

#Exiba o nome e valor do produto mais barato.
select * from produtos where valor = (select min(valor) from produtos);

#Exiba todos os produtos da categoria Telefonia com valor igual ou superior a 4.000,00.
select * from produtos where categoria = "Telefonia" and valor >= 4000;

#Liste todos os produtos cadastrados em 2018.
select * from produtos where cadastro like "2018%";

#Delete todos os produtos que possuam o nome Samsung ou LG.
delete from produtos where produto like "%Samsung%" or produto like "%LG%";

#Exiba o código do produto, onde o nome contenha o termo Intelbras.
select codigo from produtos where produto like "%Intelbras%";

#Exclua a tabela produtos.
drop table produtos;

#Exclua a base de dados.
drop database exercicio02;