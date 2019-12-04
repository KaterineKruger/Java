#Base de dados:
create database aula04;

#Selecionar base de dados:
use aula04;

#Criar tabela de cursos:
create table cursos(
	idCurso int auto_increment primary key,
    nomeCurso varchar(20),
    valorCurso double
);

###PROCEDURE

#Criar procedure de cadastro de cursos:
delimiter $
	create procedure cadastrar(in nome varchar(20), in valor double)
    begin
		#Criar variável
		declare quantidade int;
        declare mensagem varchar(50);
        
        set quantidade = (select count(*) from cursos where nomecurso = nome);
        
        if quantidade = 0 then
			insert into cursos(nomeCurso, valorCurso) values (nome, valor);
			set mensagem = "Curso cadastrado com sucesso";
        else
			set mensagem = "Falha ao cadastrar o curso";
        end if;
        
        select mensagem;
    end $;
delimiter ;

#Parâmetros de entrada: dados obrigatórios para executar a procedure
#Parâmetros de saída: dados opcionais de retorno

#Executar procedure:
call cadastrar("PHP", 2000);

#Remover procedure:
drop procedure cadastrar;

#Listar dados da tabela:
select * from cursos;

#Procedure para pesquisar um curso através do ID:
delimiter &&
	create procedure pesquisa(in id int, out nome varchar(20))
    #No MySQL apenas é possível um retorno(Select) por Procedure --- (Oracle, MySQLServer permitem múltiplos retornos)
    begin
        select nomeCurso from cursos where idCurso = id;
    end &&
delimiter ;

#Executar procedure e retornar o nome do curso:
call pesquisa(2, @retorno);
#@retorno = criando variável (É usado o símbolo '@' quando é criada uma variável fora de uma Function/Procedure)

###FUNCTION

#Permitir a crição de funções:
set global log_bin_trust_function_creators = 1;

#Função para retornar a média de valores dos cursos:
delimiter **
	create function mediaValores() returns double
	begin
        declare media double;
        set media = (select avg(valorCurso) from cursos);
        return media;
    end **
delimiter ;

#Chamar a função:
select mediaValores();

#TRIGGER (gatilho - executar algo de maneira automática)

#Exemplo com Trigger
alter table cursos add valorCursoVista double;

#Criar a Trigger
create trigger desconto before insert on cursos for each row set new.valorCursoVista = new.valorCurso*0.9;

call cadastrar("Angular", 1000);

/*
	Tempo:
    before -> antes.
    after -> depois.
    
    Obter dados da coluna:
    new -> Manipula o dado que está sendo executado.
    old -> Manipula o dado que existe na tabela ou que já foi executado.
*/