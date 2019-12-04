create database exercicio02;

use exercicio02;

create table produtos(
	codigo int auto_increment primary key,
    produto varchar(40),
    categoria varchar(20),
    valor double,
    cadastro date
);

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

select * from produtos;

select count(*) from produtos;

select * from produtos where cadastro between "2019/04/01" and "2019/07/31";

set SQL_SAFE_UPDATES = 0;

update produtos set catrgoria = "Telefonia"  where valor is null;

select categoria, count(*) from produtos group by categoria;

select categoria, avg(valor) from produtos group by categoria;

select * from produtos where valor = (select min(valor) from produtos);

select * from produtos where categoria = "Telefonia" and valor >= 4000;

select * from produtos where cadastro like "2018%";

delete from produtos where produto like "%Samsung%" or produto like "%LG%";

select codigo from produtos where produto like "%Intelbras%";

drop table produtos;

drop database exercicio02;