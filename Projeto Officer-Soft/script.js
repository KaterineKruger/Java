//Vetor - JSON
var vetor = [];

//Cadastrar
function cadastrar() {

    //Obter dados
    var nome = document.getElementById("nome").value;
    var cpf = document.getElementById("cpf").value;
    var cargo = document.getElementById("cargo").value;
    var setor = document.getElementById("setor").value;

    //Obter o local onde será exibida a mensagem
    var mensagem = document.getElementById("mensagem");

    //Validar campos
    var valida = validar(nome, cpf, cargo, setor);

    //Condicional
    if (valida == true) {

        //Adicionar ao vetor
        vetor.push({
            "nome": nome,
            "cpf": cpf,
            "cargo": cargo,
            "setor": setor
        })

        //Local Storage---

        //Limpar os campos
        limpar();

        //Listar dados
        listar();

        //Mensagem e estilo
        mensagem.innerHTML = "Cadastro efetuado com sucesso!";
        mensagem.classList.remove("alert-danger");
        mensagem.classList.add("alert-success");

        //Remover mensagem
        setInterval(function() {
            mensagem.classList.remove("alert-success");
            mensagem.innerHTML = "";
        }, 4000);

    } else {

        //Mensagem e estilo
        mensagem.innerHTML = "Favor verificar os campos!";
        mensagem.classList.add("alert-danger");

        //Remover mensagem
        setInterval(function() {
            mensagem.classList.remove("alert-danger");
            mensagem.classList.remove("alert-success");
            mensagem.innerHTML = "";
        }, 4000);
    }
}

//Limpar Campos
function limpar() {

    //Limpar Campos
    document.getElementById("nome").value = "";
    document.getElementById("cpf").value = "";
    document.getElementById("cargo").value = "";
    document.getElementById("setor").value = "";

    //Exibir ou ocultar os botões
    document.getElementById("btnCadastrar").style.display = "inline-block";
    document.getElementById("btnAlterar").style.display = "none";
    document.getElementById("btnExcluir").style.display = "none";
    document.getElementById("btnCancelar").style.display = "inline-block";

    //Cursor no campo nome
    document.getElementById("nome").focus();

}

//Listar todos os funcionários
function listar() {

    //Selecionar a tabela
    var tabela = document.getElementById("tabela");

    //Limpar os dados contidos na tabela
    tabela.innerHTML = "";

    //Laço
    for (var indice = 0; indice < vetor.length; indice++) {

        //Criar linha na tabela
        // -1 = sempre será última posição
        var linha = tabela.insertRow(-1);

        //Criar colunas
        var coluna1 = linha.insertCell(0);
        var coluna2 = linha.insertCell(1);
        var coluna3 = linha.insertCell(2);
        var coluna4 = linha.insertCell(3);
        var coluna5 = linha.insertCell(4);
        var coluna6 = linha.insertCell(5);

        //Adicionar dados
        coluna1.innerHTML = indice + 1; //Código
        coluna2.innerHTML = vetor[indice].nome;
        coluna3.innerHTML = vetor[indice].cpf;
        coluna4.innerHTML = vetor[indice].cargo;
        coluna5.innerHTML = vetor[indice].setor;
        coluna6.innerHTML = "<button class='btn btn-outline-info' onclick='selecionar(" + indice + ")'>Selecionar</button>"

    }
}

//Selecionar usuário
function selecionar(indice) {

    //Exibir os dados do usuário
    document.getElementById("indice").value = indice;
    document.getElementById("nome").value = vetor[indice].nome;
    document.getElementById("cpf").value = vetor[indice].cpf;
    document.getElementById("cargo").value = vetor[indice].cargo;
    document.getElementById("setor").value = vetor[indice].setor;

    //Exibir ou ocultar botões
    document.getElementById("btnCadastrar").style.display = "none";
    document.getElementById("btnAlterar").style.display = "inline-block";
    document.getElementById("btnExcluir").style.display = "inline-block";
    document.getElementById("btnCancelar").style.display = "inline-block";

}

//Alterar dados
function alterar() {

    //Obter dados
    var indice = document.getElementById("indice").value;
    var nome = document.getElementById("nome").value;
    var cpf = document.getElementById("cpf").value;
    var cargo = document.getElementById("cargo").value;
    var setor = document.getElementById("setor").value;

    //Alterar informações do usuário
    vetor[indice] = {
        "nome": nome,
        "cpf": cpf,
        "cargo": cargo,
        "setor": setor
    }

    //Limpar campos
    limpar();

    //Atualizar tabela
    listar();

}

//Excluir
function excluir() {

    //Obter o índice a ser removido
    var indice = document.getElementById("indice").value;

    //Remover do vetor
    vetor.splice(indice, 1);

    //Local Storage---

    //Limpar campos
    limpar();

    //Atualizar a tabela
    listar();

}

//Validar campos
function validar(nome, cpf, cargo, setor) {

    //Variável
    var valida = false;

    //Condicional
    if (nome != "" && cpf != "" && cargo != "" && setor != "") {

        //Nome
        if (nome.length >= 3) {
            valida = true;
        }

        //CPF
        if (cpf.length != 11) {
            valida = false;
        }
    }

    //Retorno
    return valida;
}